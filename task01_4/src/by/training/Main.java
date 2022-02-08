package by.training;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = scanner.nextInt();

        System.out.print("Enter y: ");
        int y = scanner.nextInt();

        if (y > 0) {
            System.out.println(y <= 4 && x <= 2 && x >= -2);
        } else {
            System.out.println(y >= -3 && x <= 4 && x >= -4);
        }

    }
}
