package pl.pp;
import java.util.Scanner;
public class MyThirdApp {

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                while (true) {

                    System.out.print("Enter temperature in Celsius (-1 to exit): ");
                    double celsius = scanner.nextDouble();


                    if (celsius == -1) {
                        System.out.println("Exiting program. Goodbye!");
                        break;
                    }

                    // Convert to Fahrenheit and Kelvin
                    double fahrenheit = 1.8 * celsius + 32.0;
                    double kelvin = celsius + 273.16;

                    // Display results with two decimal places
                    System.out.printf("Celsius: %.2f°C, Fahrenheit: %.2f°F, Kelvin: %.2fK%n", celsius, fahrenheit, kelvin);
                }

                scanner.close();
            }
        }



