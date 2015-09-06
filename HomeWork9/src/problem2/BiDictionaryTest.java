package problem2;

import java.util.*;

import javax.swing.plaf.ListUI;

import java.lang.Object;

public class BiDictionaryTest {
	public static void main(String[] args) {
		BiDictionary<String, String, Integer> distances = new BiDictionary<String, String, Integer>();
		distances.add("Sofia", "Varna", 443);
		distances.add("Sofia", "Varna", 468);
		distances.add("Sofia", "Varna", 490);
		distances.add("Sofia", "Plovdiv", 145);
		distances.add("Sofia", "Bourgas", 383);
		distances.add("Plovdiv", "Bourgas", 253);
		distances.add("Plovdiv", "Bourgas", 292);

		Set<Integer> a = distances.find("Sofia", "Varna");
		for (Integer i : a) {
			System.out.println(i);
		}
		System.out.println("-----------");
		System.out.println(distances.remove("Sofia", "Varna"));
		List<Integer> b = distances.findByKey1("Sofia");
		for (Integer i : b) {
			System.out.println(i);
		}

	}
}
