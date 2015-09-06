package problem3;

import java.util.HashSet;
import java.util.List;

import java.util.TreeMap;

public class Store<T> {
	private HashSet<Products> listOfProductsByTitle;
	// convert double price to string value to use like a key
	private TreeMap<String, List<Products>> listOfProductsByPrice;
	private TreeMap<String, TreeMap<String, List<Products>>> listOfProductsBySupplier;

	public Store() {
		setListOfProductsByTitle(new HashSet<Products>());
		setListOfProductsByPrice(new TreeMap<String, List<Products>>());
		setListOfProductsBySupplier(new TreeMap<String, TreeMap<String, List<Products>>>());
	}

	public HashSet<Products> getListOfProductsByTitle() {
		return listOfProductsByTitle;
	}

	public void setListOfProductsByTitle(HashSet<Products> listOfProductsByTitle) {
		this.listOfProductsByTitle = listOfProductsByTitle;
	}

	public TreeMap<String, List<Products>> getListOfProductsByPrice() {
		return listOfProductsByPrice;
	}

	public void setListOfProductsByPrice(
			TreeMap<String, List<Products>> listOfProductsByPrice) {
		this.listOfProductsByPrice = listOfProductsByPrice;
	}

	public TreeMap<String, TreeMap<String, List<Products>>> getListOfProductsBySupplier() {
		return listOfProductsBySupplier;
	}

	public void setListOfProductsBySupplier(
			TreeMap<String, TreeMap<String, List<Products>>> listOfProductsBySupplier) {
		this.listOfProductsBySupplier = listOfProductsBySupplier;
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
