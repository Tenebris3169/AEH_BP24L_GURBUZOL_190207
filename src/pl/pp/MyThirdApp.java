package pl.pp;
import java.util.Scanner;
public class MyThirdApp {

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                while (true) {

                    System.out.print("Enter the number of days (enter a non-positive number to exit): ");
                    int days = scanner.nextInt();


                    if (days <= 0) {
                        System.out.println("Exiting program. Goodbye!");
                        break;
                    }

                    // Convert days to weeks and remaining days
                    int weeks = days / 7;
                    int remainingDays = days % 7;

                    // Display result
                    System.out.println(days + " days is " + weeks + " weeks and " + remainingDays + " days.");
                }

                scanner.close();
            }
        }



