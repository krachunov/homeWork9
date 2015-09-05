package problem2;

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

	}
}
