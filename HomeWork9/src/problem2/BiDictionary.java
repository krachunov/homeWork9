package problem2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class BiDictionary<K1, K2, T> {
	private Map<K1, List<T>> valuesByFirstKey;
	private Map<K2, List<T>> valuesBySecondKey;
	private Map<String, List<T>> valuesByBothKeys;
	private static final String KEY_SEPARATOR = "_";

	public BiDictionary() {
		setValuesByFirstKey(new TreeMap<K1, List<T>>());
		setValuesBySecondKey(new TreeMap<K2, List<T>>());
		setValuesByBothKeys(new TreeMap<String, List<T>>());
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

	public Map<String, List<T>> getValuesByBothKeys() {
		return valuesByBothKeys;
	}

	public void setValuesByBothKeys(Map<String, List<T>> valuesByBothKeys) {
		this.valuesByBothKeys = valuesByBothKeys;
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
		String k3 = key1 + KEY_SEPARATOR + key2;
		if (!getValuesByBothKeys().containsKey(k3)) {
			List<T> list3 = new ArrayList<T>();
			list3.add(value);
			getValuesByBothKeys().put(k3, list3);
		} else {
			List<T> existingList = getValuesByBothKeys().get(k3);
			existingList.add(value);
		}
	}

	public TreeSet<T> find(K1 key1, K2 key2) {
		TreeSet<T> resultList = new TreeSet<T>();
		String key3 = key1 + "_" + key2;
		if (getValuesByBothKeys().containsKey(key3)) {
			resultList.addAll(getValuesByBothKeys().get(key3));
		}
		if (resultList.size() > 0) {
			return resultList;
		} else {
			return null;
		}
	}

	public List<T> findByKey1(K1 key1) {
		List<T> resultList = new ArrayList<T>();
		if (getValuesByFirstKey().containsKey(key1)) {
			resultList.addAll(getValuesByFirstKey().get(key1));
		}
		if (resultList.size() > 0) {
			return resultList;
		} else {
			return null;
		}
	}

	public List<T> findByKey2(K2 key2) {
		List<T> resultList = new ArrayList<T>();
		if (getValuesBySecondKey().containsKey(key2)) {
			resultList.addAll(getValuesBySecondKey().get(key2));
		}
		if (resultList.size() > 0) {
			return resultList;
		} else {
			return null;
		}
	}

	public boolean remove(K1 key1, K2 key2) {
		String key3 = key1 + KEY_SEPARATOR + key2;
		List<T> listMatching = new ArrayList<T>();
		// first we remove bothKey and get the element which matching
		if (getValuesByBothKeys().containsKey(key3)) {
			listMatching = getValuesByBothKeys().remove(key3);

		}
		// then we compares with every single key and remove only matching
		if (getValuesByFirstKey().containsKey(key1)) {
			for (T elementToRemov : listMatching) {
				getValuesByFirstKey().get(key1).remove(elementToRemov);
			}

		}
		if (getValuesBySecondKey().containsKey(key2)) {
			for (T elementToRemov : listMatching) {
				getValuesBySecondKey().get(key2).remove(elementToRemov);
			}
		}
		if (listMatching.size() <= 0) {
			return false;
		} else {
			return true;
		}
	}
}
