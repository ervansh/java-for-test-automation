package coreJavaHT_loops;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of levels for the pyramid: ");
        int numberinput = scanner.nextInt();

        int number = 1;
        while (number <= numberinput) {
            int spaceCount = numberinput - number;
            int starCount = number * 2 - 1;
            
            // Print leading spaces
            int spacesPrinted = 0;
            while (spacesPrinted < spaceCount) {
                System.out.print(" ");
                spacesPrinted++;
            }

            // Print stars
            int starsPrinted = 0;
            while (starsPrinted < starCount) {
                System.out.print("*");
                starsPrinted++;
            }
            
            // Move to the next line
            System.out.println();
            
            number++;
        }

        scanner.close();

	}

}
