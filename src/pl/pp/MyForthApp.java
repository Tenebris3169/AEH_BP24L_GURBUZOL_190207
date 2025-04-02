package pl.pp;
import java.util.Scanner;
public class MyForthApp {

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                while (true) {
                    System.out.println("Select an operation: Add(+), Subtract(-), Multiply(*), Divide(/), or Exit(x)");
                    String choice = scanner.next();

                    if (choice.equals("x")) {
                        System.out.println("Goodbye!");
                        break;
                    }

                    System.out.print("Enter first number: ");
                    while (!scanner.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a number.");
                        scanner.next();
                    }
                    double num1 = scanner.nextDouble();

                    System.out.print("Enter second number: ");
                    while (!scanner.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a number.");
                        scanner.next();
                    }
                    double num2 = scanner.nextDouble();

                    double result = 0;
                    switch (choice) {
                        case "+":
                            result = num1 + num2;
                            break;
                        case "-":
                            result = num1 - num2;
                            break;
                        case "*":
                            result = num1 * num2;
                            break;
                        case "/":
                            if (num2 == 0) {
                                System.out.println("Error: Cannot divide by zero.");
                                continue;
                            }
                            result = num1 / num2;
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                            continue;
                    }

                    System.out.println("Result: " + result + "\n");
                }
                scanner.close();
            }
        }



