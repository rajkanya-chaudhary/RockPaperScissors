import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors 
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};
        boolean playAgain = true;

        System.out.println("Welcome to Rock, Paper, Scissors!");

        while (playAgain) {
            // Computer randomly selects rock, paper, or scissors
            int computerChoice = random.nextInt(3);

            // Get the player's choice
            System.out.println("\nEnter your choice (Rock, Paper, Scissors): ");
            String playerChoice = scanner.nextLine().trim();

            // Validate the player's input
            if (!playerChoice.equalsIgnoreCase("Rock") &&
                !playerChoice.equalsIgnoreCase("Paper") &&
                !playerChoice.equalsIgnoreCase("Scissors")) {
                System.out.println("Invalid choice. Please choose Rock, Paper, or Scissors.");
                continue;
            }

            // Display computer's choice
            System.out.println("Computer chose: " + choices[computerChoice]);

            // Determine the winner
            if (playerChoice.equalsIgnoreCase(choices[computerChoice])) {
                System.out.println("It's a tie!");
            } else if (
                (playerChoice.equalsIgnoreCase("Rock") && computerChoice == 2) || // Rock beats Scissors
                (playerChoice.equalsIgnoreCase("Paper") && computerChoice == 0) || // Paper beats Rock
                (playerChoice.equalsIgnoreCase("Scissors") && computerChoice == 1) // Scissors beats Paper
            ) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            // Ask if the player wants to play again
            System.out.print("\nDo you want to play again? (yes/no): ");
            String response = scanner.nextLine().trim();
            playAgain = response.equalsIgnoreCase("yes");
        }

        System.out.println("Thanks for playing! Goodbye!");
        scanner.close();
    }
}
