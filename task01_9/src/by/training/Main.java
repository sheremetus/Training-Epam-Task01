package by.training;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the first array");
        int length1 = scanner.nextInt();
        double[] array1 = new double[length1];
        System.out.println("Enter the elements of the first array: ");
        for (int i = 0; i < length1; i++) {
            array1[i] = scanner.nextDouble();
        }
        System.out.println("Enter the size of the second array");
        int length2 = scanner.nextInt();
        double[] array2 = new double[length2];
        System.out.println("Enter the elements of the second array: ");
        for (int i = 0; i < length2; i++) {
            array2[i] = scanner.nextDouble();
        }

        System.out.println("enter a natural number less than the length of the first array: ");
        int k = scanner.nextInt();

        int length = length1 + length2;
        double[] array = new double[length];
        int count = 0;

        for (int i = 0; i < k; i++) {
            array[count++] = array1[i];

        }
10
        for (int i = 0; i < length2; i++) {
            array[count++] = array2[i];
        }

        for (int i = k; i < length1; i++) {
            array[count++] = array1[i];
        }

System.out.println("The result is: ");
        for (int i = 0; i < length; i++) {
            System.out.print(array[i]+", ");
        }


    }
}
