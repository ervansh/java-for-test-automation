package coreJavaHT_LoopsAndArrays;

public class Clump {
	public static void main(String[] args) {
		int[] array = { 1, 2, 2, 3, 4, 4 };
		int count = countClumps(array);
		System.out.println("Number of clumps: " + count);
	}

	public static int countClumps(int[] nums) {
		int count = 0;
		boolean isClump = false;

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1] && !isClump) {
				isClump = true;
				count++;
			} else if (nums[i] != nums[i + 1]) {
				isClump = false;
			}
		}
		return count;
	}
}
