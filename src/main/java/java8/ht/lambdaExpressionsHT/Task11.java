package java8.ht.lambdaExpressionsHT;

import java.util.ArrayList;
import java.util.Collections;

public class Task11 {

	public static void main(String[] args) {

		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("Vansh", 230));
		list.add(new Employee("John", 301));
		list.add(new Employee("Ansh", 270));
		list.add(new Employee("King", 30));

		System.out.println("List before sorting : \n" + list);
//		Comparator<Employee> empsort = (e1, e2) -> e2.getName().compareTo(e1.getName());
//		Collections.sort(list, empsort);

		// also write as :
		Collections.sort(list, (e1, e2) -> e2.getName().compareTo(e1.getName()));

		list.stream().forEach(e -> System.out.println(e));

	}

}
