import java.util.Scanner;
import java.util.Random;

public class NumGuessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lBound = 1;  
        int uBound = 100; 
        int numToGuess = random.nextInt(uBound - lBound + 1) + lBound;
        int maxattempts = 10; 

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between " + lBound + " and " + uBound + ". Try to guess it!");

        int attempts = 0;

        while (attempts < maxattempts) {
            System.out.print("Enter your guess: ");
            int playerguess = scanner.nextInt();
            attempts++;

            if (playerguess < lBound || playerguess > uBound) {
                System.out.println("Please enter a number between " + lBound + " and " + uBound + ".");
                continue;
            }

            if (playerguess < numToGuess) {
                System.out.println("Too low! Try again.");
            } else if (playerguess > numToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number " + numToGuess + " in " + attempts + " attempts.");
                break;
            }
        }

        if (attempts >= maxattempts) {
            System.out.println("Sorry, you've used up all your attempts. The correct number was " + numToGuess + ".");
        }

        scanner.close();
    }
}