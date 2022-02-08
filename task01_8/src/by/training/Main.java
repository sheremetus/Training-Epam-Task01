package by.training;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter K");
        double K = scanner.nextDouble();

        double[] array = new double[5];
        System.out.println("Enter 5 array elements");
        for (int i = 0; i < 5; i++) {
            array[i] = scanner.nextDouble();

            if (array[i] % K == 0) {
                sum += array[i];
            }
        }

        System.out.println("The sum of elements divisible by " + K + " is " + sum);


    }
}
