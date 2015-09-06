package problem3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeMap;

public class Store {
	private TreeMap<String, Products> listOfProductsByTitle;
	// convert double price to string value to use like a key
	private TreeMap<String, List<Products>> listOfProductsByPrice;
	private TreeMap<String, TreeMap<String, List<Products>>> listOfProductsBySupplier;

	public Store() {
		setListOfProductsByTitle(new TreeMap<String, Products>());
		setListOfProductsByPrice(new TreeMap<String, List<Products>>());
		setListOfProductsBySupplier(new TreeMap<String, TreeMap<String, List<Products>>>());
	}

	public TreeMap<String, Products> getListOfProductsByTitle() {
		return listOfProductsByTitle;
	}

	public void setListOfProductsByTitle(
			TreeMap<String, Products> listOfProductsByTitle) {
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

	private void addByTitle(String title, String supplier, double price, int id) {
		Products product = new Products(title, supplier, price, id);
		getListOfProductsByTitle().put(title, product);
	}

	private void addByPrice(String title, String supplier, double price, int id) {
		Products product = new Products(title, supplier, price, id);
		String priceValue = Double.toString(price);
		if (!getListOfProductsByPrice().containsKey(priceValue)) {
			List<Products> listOfProducts = new ArrayList<Products>();
			listOfProducts.add(product);
			getListOfProductsByPrice().put(priceValue, listOfProducts);
		} else {
			List<Products> listOfProducts = getListOfProductsByPrice().get(
					priceValue);
			listOfProducts.add(product);
		}
	}

	public void add(String title, String supplier, double price, int id) {
		addByTitle(title, supplier, price, id);
		addByPrice(title, supplier, price, id);
	}

	public boolean remove() {
		// TODO
		return false;
	}

	public List<Products> findPriceRange() {
		// TODO
		return null;

	}
}
