package java8.ht.lambdaExpressionsHT;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Task2_BiggestNumber {
	public static void main(String[] args) {
		//using lambda expressions.
				List<Integer> numbers = Arrays.asList(3, 6, 1, 9, 12, 0, 9);
				Optional<Integer> max = numbers.stream()
						.sorted(Comparator.reverseOrder())
						.skip(1)
						.findFirst();
				max.ifPresent(n -> System.out.println("Max number in the given list is " + n));

			}

			/**
			 * public static int biggestNumber() { int biggestnumber = 0;
			 * 
			 * ArrayList<Integer> list = new ArrayList<Integer>(); list.add(10);
			 * list.add(190); list.add(1001); list.add(1); list.add(50); list.add(78);
			 * 
			 * for (Integer integer : list) { if (integer > biggestnumber) { biggestnumber =
			 * integer; } } return biggestnumber; }
			 */
}
