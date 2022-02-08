package by.training;

import java.util.Scanner;

import static java.lang.Math.*;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the length of the first leg: ");
        double a = scanner.nextDouble();

        System.out.print("enter the length of the second leg: ");
        double b = scanner.nextDouble();

        double square = (a * b) / 2;

        double c = sqrt(pow(a, 2) + pow(b, 2));

        double P = a + b + c;

        System.out.println("The perimeter of a right triangle with legs "
                +a+", "+ b+" and hypotenuse "+c+" is "+P);

        System.out.println("The square of a right triangle with legs "
                +a+", "+ b+" and hypotenuse "+c+" is "+square);

    }
}
