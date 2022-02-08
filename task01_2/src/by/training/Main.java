package by.training;

import java.util.Scanner;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a: ");
        double a = scanner.nextDouble();

        System.out.print("Please enter b: ");
        double b = scanner.nextDouble();

        System.out.print("Please enter c: ");
        double c = scanner.nextDouble();

        double result = ((b + sqrt(pow(b, 2) + 4 * a * c)) / (2 * a)) - (pow(a, 3) * c) + pow(b, -2);

        System.out.println("The result is: " + result);
    }
}
