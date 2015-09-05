package problem2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class BiDictionary<K1, K2, T> {
	private Map<K1, List<T>> valuesByFirstKey;
	private Map<K2, List<T>> valuesBySecondKey;

	public BiDictionary() {
		setValuesByFirstKey(new TreeMap<K1, List<T>>());
		setValuesBySecondKey(new TreeMap<K2, List<T>>());
	}

	public Map<K1, List<T>> getValuesByFirstKey() {
		return valuesByFirstKey;
	}

	public void setValuesByFirstKey(Map<K1, List<T>> valuesByFirstKey) {
		this.valuesByFirstKey = valuesByFirstKey;
	}

	public Map<K2, List<T>> getValuesBySecondKey() {
		return valuesBySecondKey;
	}

	public void setValuesBySecondKey(Map<K2, List<T>> valuesBySecondKey) {
		this.valuesBySecondKey = valuesBySecondKey;
	}

	public void add(K1 key1, K2 key2, T value) {
		if (!getValuesByFirstKey().containsKey(key1)) {
			List<T> list = new ArrayList<T>();
			list.add(value);
			getValuesByFirstKey().put(key1, list);
		} else {
			List<T> existingList = getValuesByFirstKey().get(key1);
			existingList.add(value);
		}
		if (!getValuesBySecondKey().containsKey(key2)) {
			List<T> list2 = new ArrayList<T>();
			list2.add(value);
			getValuesBySecondKey().put(key2, list2);
		} else {
			List<T> existingList = getValuesBySecondKey().get(key2);
			existingList.add(value);
		}
	}

	public List<T> find(K1 key1, K2 key2) {
		// TODO
		return null;
	}

	public List<T> findByKey1(K1 key1) {
		// TODO
		return null;
	}

	public List<T> findByKey2(K2 key2) {
		// TODO
		return null;
	}

	public boolean remove(K1 key1, K2 key2) {
		// TODO
		return false;
	}

}
