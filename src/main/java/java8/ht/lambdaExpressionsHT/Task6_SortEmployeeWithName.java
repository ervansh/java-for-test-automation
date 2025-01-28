package java8.ht.lambdaExpressionsHT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task6_SortEmployeeWithName implements Comparator<Employee> {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("Vansh", 678));
		list.add(new Employee("Ansh", 78));
		list.add(new Employee("John", 378));
		list.add(new Employee("Dev", 608));

		System.out.println("List before sorting : ");
		list.stream().forEach(e -> System.out.println(e));

		// sorting
		Collections.sort(list, new Task6_SortEmployeeWithName());

		System.out.println("\n List after sorting : \n");
		list.stream().forEach(e -> System.out.println(e));
	}

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}
}
