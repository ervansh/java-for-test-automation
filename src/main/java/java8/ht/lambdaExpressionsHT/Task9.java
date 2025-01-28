package java8.ht.lambdaExpressionsHT;

import java.util.Map.Entry;
import java.util.TreeMap;

public class Task9 {
	/**
	 * Problem statement: Create a TreeMap that sorts the given set of values in
	 * descending order
	 * 
	 */
	public static void main(String[] args) {

		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>((a, b) -> b.compareTo(a));
		tmap.put(1, "Vansh");
		tmap.put(10, "Ansh");
		tmap.put(100, "John");
		tmap.put(55, "Jimmy");
		tmap.put(2, "Wong");

		System.out.println("Descending order sorting is : ");
		for (Entry<Integer, String> set : tmap.entrySet()) {
			Integer key = set.getKey();
			System.out.println(key);
		}

	}
}
