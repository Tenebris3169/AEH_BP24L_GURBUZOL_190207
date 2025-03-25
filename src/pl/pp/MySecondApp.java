package pl.pp;

import java.util.Scanner;
public class MySecondApp {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age in years: ");
        int ageYears = scanner.nextInt();

        int secondsPerYear = 365 * 24 * 60 * 60; // Days in a year * hours * minutes * seconds
        long ageInSeconds = (long) ageYears * secondsPerYear;

        System.out.println("Your age in seconds is: " + ageInSeconds + " seconds.");

        scanner.close();
    }
}
