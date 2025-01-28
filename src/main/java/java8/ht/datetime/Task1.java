package java8.ht.datetime;

import java.time.LocalDate;
import java.util.function.Predicate;

public class Task1 {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		System.out.println("Todays date: " + today);

		LocalDate yesterday = today.minusDays(1);
		System.out.println(yesterday);

		Predicate<LocalDate> datecheck = date -> date.equals(LocalDate.now().minusDays(1));

		if (datecheck.test(yesterday)) {
			System.out.println("Date is yesterday");
		}

	}

}
