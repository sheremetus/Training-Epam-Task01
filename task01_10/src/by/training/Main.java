package by.training;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of matrix: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(j + "  ");
                }
            } else {
                for (int j = n; j > 0; j--) {
                    System.out.print(j + "  ");
                }
            }
            System.out.println("\n");
        }

    }
}
