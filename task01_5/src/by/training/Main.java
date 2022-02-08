package by.training;

import java.util.Scanner;
import static java.lang.Math.*;

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

        for (int i = 0; i <3 ; i++) {
            if(array[i]>=0){
                System.out.println("for number "+array[i]+" result is: "+pow(array[i],2));
            }
            else{
                System.out.println("for number "+array[i]+" result is: "+pow(array[i],4));
            }
        }
    }
}
