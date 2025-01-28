package coreJavaHT_LoopsAndArrays;

public class ArrayBalancer {
	public static void main(String[] args) {
		System.out.println(canBalance(new int[] { 1, 1, 1, 2, 1 })); // true
		System.out.println(canBalance(new int[] { 2, 1, 1, 2, 1 })); // false
	}

	public static boolean canBalance(int[] nums) {
		int totalSum = 0;

		// First, calculate the total sum of the array
		for (int num : nums) {
			totalSum += num;
		}

		int leftSum = 0;
		for (int num : nums) {
			// Increase the left sum by the current number
			leftSum += num;

			// Check if the left sum equals the total sum minus the left sum
			if (leftSum == totalSum - leftSum) {
				return true;
			}
		}

		return false;
	}
}
