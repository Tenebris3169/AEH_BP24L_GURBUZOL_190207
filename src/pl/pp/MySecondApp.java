package pl.pp;

import java.util.Scanner;
public class MySecondApp {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // Step 1: Create an integer variable x and assign it a value of 10
        int x = 10;

        // Step 2: Calculate double of x
        int doubleX = 2 * x;

        // Step 3: Calculate x squared
        int squaredX = x * x;

        // Step 4: Display the results
        System.out.println("The original value of x: " + x);
        System.out.println("Double of x: " + doubleX);
        System.out.println("x squared: " + squaredX);

        scanner.close();
    }
}
