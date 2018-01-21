package com.programs.challenges.collections.diskBackedMap;

import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

class EntrySet<K extends Serializable, V extends Serializable> extends AbstractSet<Map.Entry<K, V>> {

	private DiskBackedMap<K, V> map;

	public EntrySet(DiskBackedMap<K, V> map) {
		this.map = map;
	}

	@Override
	public Iterator<Map.Entry<K, V>> iterator() {
		return new EntryIterator<K, V>(map);
	}

	@Override
	@SuppressWarnings("unchecked")
	public boolean contains(Object o) {
		if (!(o instanceof Map.Entry))
			return false;

		Map.Entry<K, V> e = (Map.Entry<K, V>) o;
		V value = map.get(e.getKey());
		return value != null && value.equals(e.getValue());
	}

	@Override
	public int size() {
		return map.size();
	}

	@Override
	public void clear() {
		map.clear();
	}

	@Override
	public boolean add(Map.Entry<K, V> e) {
		map.put(e.getKey(), e.getValue());
		return true;
	}

	@Override
	public boolean addAll(Collection<? extends Map.Entry<K, V>> c) {
		for (Map.Entry<K, V> e : c)
			map.put(e.getKey(), e.getValue());

		return true;
	}

	@Override
	@SuppressWarnings("unchecked")
	public boolean containsAll(Collection<?> c) {
		Collection<Map.Entry<K, V>> ec = (Collection<Map.Entry<K, V>>) c;
		for (Map.Entry<K, V> e : ec)
			if (!contains(e))
				return false;

		return true;
	}

	@Override
	public boolean isEmpty() {
		return map.isEmpty();
	}

	@Override
	@SuppressWarnings("unchecked")
	public boolean remove(Object o) {
		if (!(o instanceof Map.Entry))
			return false;

		Map.Entry<K, V> e = (Map.Entry<K, V>) o;
		if (!contains(e))
			return false;

		map.remove(e.getKey());
		return true;
	}

	@Override
	@SuppressWarnings("unchecked")
	public boolean removeAll(Collection<?> c) {
		Collection<Map.Entry<K, V>> ec = (Collection<Map.Entry<K, V>>) c;
		for (Map.Entry<K, V> e : ec)
			remove(e);

		return true;
	}

	@Override
	@SuppressWarnings("unchecked")
	public boolean retainAll(Collection<?> c) {
		Collection<Map.Entry<K, V>> ec = (Collection<Map.Entry<K, V>>) c;
		Iterator<Map.Entry<K, V>> iterator = iterator();

		Map.Entry<K, V> entry = null;
		while (iterator.hasNext()) {
			entry = iterator.next();
			if (!ec.contains(entry))
				remove(entry);
		}

		return true;
	}
}
