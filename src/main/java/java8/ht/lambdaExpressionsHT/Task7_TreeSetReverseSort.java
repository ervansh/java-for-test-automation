package java8.ht.lambdaExpressionsHT;

import java.util.TreeSet;

public class Task7_TreeSetReverseSort {
	public static void main(String[] args) {

		TreeSet<Integer> tset = new TreeSet<>((a, b) -> b.compareTo(a));
		tset.add(9);
		tset.add(67);
		tset.add(10);
		tset.add(35);
		tset.add(5);

		System.out.println("After reverse sorting : " + tset);
	}
}
