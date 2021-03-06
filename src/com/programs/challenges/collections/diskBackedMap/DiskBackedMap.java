/**
 * @author pranshu
 * 
 */
package com.programs.challenges.collections.diskBackedMap;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.programs.challenges.collections.diskBackedMap.serializers.DataSerializer;
import com.programs.challenges.collections.diskBackedMap.serializers.ObjectSerializer;
import com.programs.challenges.collections.diskBackedMap.util.FileUtils;

public class DiskBackedMap<K extends Serializable, V extends Serializable> implements Map<K, V> {

	private static int MAX_CAPACITY = 1000000001;
	protected static final DecimalFormat format = new DecimalFormat("000000000");
	
	protected EntrySet<K, V> entrySet;
	protected KeySet<K, V> keySet;
	protected ValueSet<K, V> valueSet;

	protected File root;
	protected File keyStore;
	protected File valueStore;

	protected boolean force;
	protected ObjectSerializer serializer;

	public DiskBackedMap(File root) {
		this(root, true);
	}

	public DiskBackedMap(File root, boolean force) {
		this(root, new DataSerializer(), force);
	}

	public DiskBackedMap(File root, ObjectSerializer serializer, boolean force) {
		this.root = root;
		this.serializer = serializer;
		this.force = force;

		if (!root.isDirectory())
			root.mkdir();

		keyStore = new File(root, "keys");
		if (!keyStore.isDirectory())
			keyStore.mkdir();

		valueStore = new File(root, "values");
		if (!valueStore.isDirectory())
			valueStore.mkdir();

		entrySet = new EntrySet<K, V>(this);
		keySet = new KeySet<K, V>(this);
		valueSet = new ValueSet<K, V>(this);
	}

	public synchronized boolean containsKey(Object key) {
		try {
			return getFileName(key, false) != null;
		}
		catch (IOException ioe) {
			return false;
		}
	}

	public synchronized boolean containsValue(Object v) {
		Collection<V> values = values();
		for (V value : values)
			if (v.equals(value))
				return true;

		return false;
	}

	public synchronized V get(Object key) {
		try {
			String fileName = getFileName(key, false);
			if (fileName == null)
				return null;

			File valueFile = new File(valueStore, fileName);
			return (V) serializer.readObject(valueFile);
		}
		catch (IOException ioe) {
			return null;
		}
	}

	public synchronized V put(K key, V value) {
		try {
			V oldValue = null;
			
			String fileName = getFileName(key, true);
			
			File keyFile = new File(keyStore, fileName);
			File valueFile = new File(valueStore, fileName);

			if (valueFile.exists())
				oldValue = (V) serializer.readObject(valueFile);
			
			
			serializer.writeObject(keyFile, key, force);
			serializer.writeObject(valueFile, value, force);

			return oldValue;
		}
		catch (IOException ioe) {
			return null;
		}
	}

	public synchronized void putAll(Map<? extends K, ? extends V> m) {
		for (Map.Entry<? extends K, ? extends V> e : m.entrySet()) {
			put (e.getKey(), e.getValue());
		}
	}

	@SuppressWarnings("unchecked")
	public synchronized V remove(Object key) {
		try {
			String fileName = getFileName(key, false);

			File keyFile = new File(keyStore, fileName);
			File valueFile = new File(valueStore, fileName);

			V oldValue = (V) serializer.readObject(valueFile);

			keyFile.delete();
			valueFile.delete();

			while(!keyFile.getParentFile().equals(keyStore)
				&& keyFile.getParentFile().listFiles().length == 0) {
					keyFile.getParentFile().delete();
					keyFile = keyFile.getParentFile();		
			}
			
			while(!valueFile.getParentFile().equals(valueStore)
				&& valueFile.getParentFile().listFiles().length == 0) {
					valueFile.getParentFile().delete();
					valueFile = valueFile.getParentFile();
			}

			return oldValue;
		}
		catch (IOException ioe) {
			return null;
		}
	}

	public synchronized boolean isEmpty() {
		return keyStore.listFiles().length == 0;
	}

	public synchronized void clear() {
		File[] keyFiles = root.listFiles();
        if (keyFiles != null) {
            for (File f : keyFiles) {
                FileUtils.deleteDirectory(f);
            }
        }

		keyStore.mkdir();
		valueStore.mkdir();
	}

	public synchronized Collection<V> values() {
		return valueSet;
	}

	public synchronized Set<K> keySet() {
		return keySet;
	}

	public synchronized Set<Map.Entry<K, V>> entrySet() {
		return entrySet;
	}

	protected String getFileName(Object key, boolean create) throws IOException {
		String fileName = getFileName(key);
		File keyFile = null;

		// Handle the directories
		String dirName = fileName.substring(0, 9);
		File keyDir = new File(keyStore, dirName);
		File valueDir = new File(valueStore, dirName);

		if (create) {
			keyDir.mkdirs();
			valueDir.mkdirs();
		}
		else if (!keyDir.isDirectory() || !valueDir.isDirectory())
			return null;

		// Find the first position which isn't being used
		String fileNameI = null;
		for (int i = 0;true;i++) {
			fileNameI = fileName + i;

			keyFile = new File(keyStore, fileNameI);
			if (!keyFile.exists()) { // If there isn't such a key, stick it here
				if (!create)
					return null;
				else
					break;
			}

			K candidateKey = (K) serializer.readObject(keyFile);
			if (key.equals(candidateKey)) // If the key matches, overwrite it
				break;

			// otherwise, try the next position
		}

		return fileNameI;
	}

	protected String getFileName(Object key) {
		//Forcing sined bit to zero
		String fileName = format.format((key.hashCode() & 0x7FFFFFFF) % MAX_CAPACITY);
		StringBuffer buffer = new StringBuffer(12);

		buffer.append(fileName.substring(7)).append(File.separator);	
		buffer.append(fileName.substring(5,7)).append(File.separator);	
		buffer.append(fileName.substring(3,5)).append(File.separator);	
		// file name
		buffer.append(fileName.substring(0,3));

		return buffer.toString();
	}
	
	public void setMaxCapacity(int maxCapacity){
		if(maxCapacity > 0){
			MAX_CAPACITY = maxCapacity;
		}
	}

	protected class FileIterator implements Iterator<File> {
		private static final int MAX_DEPTH = 4;
		private static final int NOT_STARTED = -1;

		protected File root;
		protected File current;
		protected File[][] files;
		protected int[] indices;

		public FileIterator(File root) {
			this.root = root;

			files = new File[MAX_DEPTH][];
			indices = new int[MAX_DEPTH];

			Arrays.fill(indices, NOT_STARTED);

			current = null;
		}

		@Override
		public boolean hasNext() {
			synchronized (DiskBackedMap.this) {
				try {
					return iterateFiles(root, 0, false) != null;
				} catch (IOException e) {
					return false;
				}
			}
		}

		@Override
		public File next() {
			synchronized (DiskBackedMap.this) {
				try {
					current = iterateFiles(root, 0, true);
					return current;
				}
				catch (IOException ioe) {
					return null;
				}
			}
		}

		@Override
		public void remove() {
			synchronized (DiskBackedMap.this) {
				if (current == null)
					return;

				current.delete();
			}
		}

		protected File iterateFiles(File dir, int index, boolean increment) throws IOException {
			if (!dir.exists())
				return null;

			// If we haven't stared at this depth, initialize the file list and start at the beginning
			if (indices[index] == NOT_STARTED) {
				indices[index] = 0;
				files[index] = dir.listFiles();
			}

			// If we have finished this depth
			if (indices[index] >= files[index].length){
				indices[index] = NOT_STARTED;
				files[index] = null;
				return null;
			}

			File currentFile = files[index][indices[index]];
			// It is a directory so we look inside it
			if (currentFile.isDirectory()) {
				File subFile = null;

				while ((subFile = iterateFiles(currentFile, index + 1, increment)) == null) {
					indices[index]++;
					if (indices[index] >= files[index].length) {
						indices[index] = NOT_STARTED;
						files[index] = null;
						return null;
					}
					currentFile = files[index][indices[index]];
				}

				return subFile;
			}
			// This is a file, it will do just fine!
			else {
				if (increment)
					indices[index]++;

				return currentFile;
			}
		}
	}

	@Override
	public int size() {
		return keyStore.listFiles().length;
	}
}
