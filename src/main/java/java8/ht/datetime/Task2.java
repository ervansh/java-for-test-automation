package java8.ht.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.function.Supplier;

public class Task2 {

	Supplier<LocalDate> getdate = () -> {
		LocalDate today = LocalDate.now();
		int daysuntilthursday = DayOfWeek.THURSDAY.getValue() - today.getDayOfWeek().getValue();
		if (daysuntilthursday <= 0) {
			daysuntilthursday += 7;
		}
		return today.plusDays(daysuntilthursday);
	};
	
	
}
