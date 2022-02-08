package by.training;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your number: ");
        int number = scanner.nextInt();
        int[] numsArray = new int[4];

        for (int i = 0; i < 4; i++) {
            numsArray[i] = number % 10;
            number = number / 10;
        }

        System.out.println((numsArray[0] + numsArray[1]) == (numsArray[2] + numsArray[3]));


    }
}
