import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate a random number between 1 and 100
        int randomNumber = random.nextInt(100) + 1;

        int userGuess;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        do {
           
            System.out.print("Enter your guess (between 1 and 100): ");
            userGuess = scanner.nextInt();
            attempts++;

            //  feedback on the guess
            if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number " + randomNumber + " correctly in "
                        + attempts + " attempts.");
            }
        } while (userGuess != randomNumber);

        scanner.close();
    }
}
