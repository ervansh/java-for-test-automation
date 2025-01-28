package java8.ht.datetime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.function.Supplier;

public class Task3 {

	public static void main(String[] args) {
		/**
		 * LocalTime est_time = LocalTime.now(ZoneId.of("US/Eastern"));
		 * System.out.println(est_time);
		 */

		// using supplier
		Supplier<LocalTime> get_est_time = () -> {
			return LocalTime.now(ZoneId.of("US/Eastern"));
		};
		LocalTime est_time = get_est_time.get();
		System.out.println(est_time);
	}

}
