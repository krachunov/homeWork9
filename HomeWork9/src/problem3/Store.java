package problem3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Store<T> {
//	private hashSet 
	private Map<String, Double> listOfProducts;

	public Store() {
		setListOfProducts(new TreeMap<String, Double>());
	}

	public Map<String, Double> getListOfProducts() {
		return listOfProducts;
	}

	public void setListOfProducts(Map<String, Double> listOfProducts) {
		this.listOfProducts = listOfProducts;
	}

	public void add() {
		// TODO
	}

	public boolean remove() {
		// TODO
		return false;
	}

	public List<T> findPriceRange() {
		// TODO
		return null;

	}
}
