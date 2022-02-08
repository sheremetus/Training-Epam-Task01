package by.training;

import java.util.Scanner;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter left border a: ");

        double a = scanner.nextDouble();
        double b;
        do {
            System.out.println("Enter right border b (b must be greater than a): ");
            b = scanner.nextDouble();
        }
        while (a > b);

        System.out.println("Enter step h: ");
        double h = scanner.nextDouble();

        for (double x = a; x <= b; x += h) {
            System.out.println("x= " + x + " | " + "y= " + (pow(sin(x), 2) - cos(2 * x)));

        }

    }
}
