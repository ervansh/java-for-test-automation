package coreJavaHT_Arrays_Strings;

public class SmallestAndLargestNumberInArray {

	public static void main(String[] args) {
		int[] numbers = { 34, 7, 23, 32, 95, 14, 78, 63, 84, 12, -7, 45 };

		int smallest = 0;
		int biggest = 0;

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > biggest) {
				biggest = numbers[i];
			}
			if (numbers[i] < smallest) {
				smallest = numbers[i];
			}
		}

		System.out.println("Biggest no is : " + biggest);
		System.out.println("Biggest no is : " + smallest);
	}

}
