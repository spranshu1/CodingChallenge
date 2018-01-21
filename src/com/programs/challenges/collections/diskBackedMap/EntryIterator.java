package com.programs.challenges.collections.diskBackedMap;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

class EntryIterator<K extends Serializable, V extends Serializable> implements Iterator<Map.Entry<K, V>> {

	private DiskBackedMap<K, V> map;
	private Iterator<K> iterator;
	private K current;

	public EntryIterator(DiskBackedMap<K, V> map) {
		this.map = map;

		iterator = new KeyIterator<K, V>(map);
		current = null;
	}

	public boolean hasNext() {
		return iterator.hasNext();
	}

	public Map.Entry<K, V> next() {
		current = iterator.next();

		return new AbstractMap.SimpleEntry<K, V>(current, map.get(current));
	}

	public void remove() {
		if (current != null)
			map.remove(current);
	}
}
