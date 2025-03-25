package pl.pp;

import java.util.Scanner;
public class MySecondApp {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String forename = scanner.nextLine();

        System.out.println("Please enter your surname:");
        String surname = scanner.nextLine();

        scanner.close();
        System.out.println("Welcome " + forename + " " + surname);

    }
}
