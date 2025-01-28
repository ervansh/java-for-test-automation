package java8.ht.lambdaExpressionsHT;

import java.util.Comparator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Task10 {
	/**
	 * Problem : Create a TreeMap that sorts the given set of employees in
	 * descending order of their name
	 */

	public static void main(String[] args) {

		Comparator<Employee> empcomp = (e1, e2) -> e2.getName().compareTo(e1.getName());

		TreeMap<Employee, String> tmap = new TreeMap<>(empcomp);
		tmap.put(new Employee("Vansh", 671), "Manager");
		tmap.put(new Employee("Ansh", 503), "VP");
		tmap.put(new Employee("John", 343), "Principle");
		tmap.put(new Employee("Jimmy", 901), "Junior");
		tmap.put(new Employee("Wong", 371), "Senior");

		System.out.println(" Descending order sorting is : \n");
		for (Entry<Employee, String> set : tmap.entrySet()) {
			Employee key = set.getKey();
			System.out.println(key);
		}
	}
}
