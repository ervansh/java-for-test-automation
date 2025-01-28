package java8.ht.lambdaExpressionsHT;

import java.util.Set;
import java.util.TreeSet;

public class Task8_SortEmployeeWithName_UsingTreeSet {
	public static void main(String[] args) {
		Set<Employee> tset = new TreeSet<>((e1, e2) -> e2.getName().compareTo(e1.getName()));
		tset.add(new Employee("Vansh", 678));
		tset.add(new Employee("Ansh", 78));
		tset.add(new Employee("John", 378));
		tset.add(new Employee("Dev", 608));

		tset.forEach(System.out::println);
	}
}
