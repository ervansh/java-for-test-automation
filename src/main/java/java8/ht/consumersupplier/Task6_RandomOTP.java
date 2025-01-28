package java8.ht.consumersupplier;

import java.util.Random;
import java.util.function.Supplier;

public class Task6_RandomOTP {

	public static void main(String[] args) {

		Supplier<Integer> getotp = () -> {
			Random random = new Random();
			return random.nextInt(1000, 9999);
		};

		Integer otp = getotp.get();
		System.out.println("OTP is : " + otp);
	}

}
