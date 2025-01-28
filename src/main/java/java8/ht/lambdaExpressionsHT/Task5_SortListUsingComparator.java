package java8.ht.lambdaExpressionsHT;

import java.util.ArrayList;
import java.util.Collections;

public class Task5_SortListUsingComparator {
	// Problem statement: Use Comparator inerface to sort given list of numbers in
	// reverse order

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(90);

		list.add(50);
		list.add(10);
		list.add(93);
		list.add(34);
		list.add(67);

		System.out.println("List before sorting: " + list);

		Collections.sort(list);
		System.out.println("List after natural order sorting: " + list);

		Collections.sort(list, (a, b) -> b.compareTo(a));
		System.out.println("List after reverse order sorting: " + list);
	}
}
