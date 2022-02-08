package by.training;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] array = new double[3];
        System.out.println("Enter first number");
        array[0] = scanner.nextDouble();
        System.out.println("Enter second number");
        array[1] = scanner.nextDouble();
        System.out.println("Enter third number");
        array[2] = scanner.nextDouble();

        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        for (int i = 0; i < 3; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }

        }
        System.out.println("Min+Max = " + (max + min));

    }
}
