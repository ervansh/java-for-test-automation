package coreJavaHT_LoopsAndArrays;

public class MaxSpanOfNumberInArray {

	public static void main(String[] args) {
		
		System.out.println(maxSpan(new int[]{1, 2, 1, 1, 3})); // → 4
        System.out.println(maxSpan(new int[]{1, 4, 2, 1, 4, 1, 4})); // → 6
        System.out.println(maxSpan(new int[]{1, 4, 2, 1, 4, 4, 4})); // → 6

	}
	
	
	public static int maxSpan(int[] numbers) {
        int maxSpan = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = numbers.length - 1; j >= i; j--) {
                if (numbers[i] == numbers[j]) {
                    int span = j - i + 1;
                    if (span > maxSpan) {
                        maxSpan = span;
                    }
                    break; // Once the furthest same element is found, move to the next i
                }
            }
        }

        return maxSpan;
    }

}
