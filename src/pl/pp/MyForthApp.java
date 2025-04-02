package pl.pp;
import java.util.Scanner;
public class MyForthApp {

            public static void main(String[] args) {
                    Scanner scanner = new Scanner(System.in);
                    boolean firstTime = true;

                    while (true) {
                        if (firstTime) {
                            System.out.print("Enter lower and upper integer limits: ");
                            firstTime = false;
                        } else {
                            System.out.print("Enter next set of limits: ");
                        }

                        int lower = scanner.nextInt();
                        int upper = scanner.nextInt();

                        if (upper <= lower) {
                            System.out.println("Done");
                            break;
                        }

                        int sumOfSquares = 0;
                        for (int i = lower; i <= upper; i++) {
                            sumOfSquares += i * i;
                        }

                        System.out.println("The sums of the squares from " + (lower * lower) + " to " + (upper * upper) + " is " + sumOfSquares + "\n");
                    }

                    scanner.close();
            }
        }



