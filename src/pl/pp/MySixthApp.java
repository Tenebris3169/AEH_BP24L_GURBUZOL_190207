package pl.pp;

public class MySixthApp {
    public static void main(String[] args) {

        /*
        // --- Previous demo code commented out ---
        System.out.println("Calculations and display of the result for values assigned in the application code");
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your score #1 is " + finalScore);
        }

        System.out.println("Calculations and display of the result for values assigned in the application code (different from before)");
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your score #2 is " + finalScore);
        }

        System.out.println("Calculations using the method calculateScore_noArguments(), but still for values assigned in the method code");
        calculateScore_noArguments();

        System.out.println("Calculations using the method calculateScore(), but this time for values entered into the method call argument");
        calculateScore_arguments(true, 2500, 9, 250);
        calculateScore_arguments(gameOver, score, levelCompleted, bonus);

        System.out.println("Calculations and display can be made independent of each other by adding a parameter that this method will return using return");
        finalScore = calculateScore_argumentsReturn(gameOver, score, levelCompleted, bonus);
        System.out.println("Your score #5 is " + finalScore);
        */

        int N = 20;

        // Iterative method
        long startTimeIterative = System.nanoTime();
        long factorialIterative = factorialIterative(N);
        long endTimeIterative = System.nanoTime();
        long durationIterative = endTimeIterative - startTimeIterative;

        System.out.println("Factorial of " + N + " (iterative): " + factorialIterative);
        System.out.println("Execution time (iterative): " + durationIterative + " nanoseconds");

        // Recursive method
        long startTimeRecursive = System.nanoTime();
        long factorialRecursive = factorialRecursive(N);
        long endTimeRecursive = System.nanoTime();
        long durationRecursive = endTimeRecursive - startTimeRecursive;

        System.out.println("Factorial of " + N + " (recursive): " + factorialRecursive);
        System.out.println("Execution time (recursive): " + durationRecursive + " nanoseconds");
    }

    // Iterative method to calculate factorial
    private static long factorialIterative(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Recursive method to calculate factorial
    private static long factorialRecursive(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }
}
