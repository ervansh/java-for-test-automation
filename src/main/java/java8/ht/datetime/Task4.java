package java8.ht.datetime;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public class Task4 {

	public static void main(String[] args) {

		Function<LocalDate, String> getage = dob -> {
			LocalDate today = LocalDate.now();
			Period period = Period.between(dob, today);
			int years = period.getYears();
			int months = period.getMonths();
			int days = period.getDays();
			String age = "Years: "+String.valueOf(years)+"\n"+
					"Months: "+String.valueOf(months)+"\n"+
					"Days: "+String.valueOf(days);
			return age;
		};

		LocalDate dob = LocalDate.of(2000, 10, 15);
		String age = getage.apply(dob);
		System.out.println(age);
	}

}
