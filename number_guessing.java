import java.util.Scanner;

class Game {

    public void introduction() {
        System.out.println("==========================================");
        System.out.println("   Welcome to the Number Guessing Game   ");
        System.out.println("==========================================");
        System.out.println("Guess the number with 5 lifelines and win the game!!");
        System.out.println("==========================================");
    }

    public void number_guessing() {
        boolean playAgain = true;
        try (Scanner sc = new Scanner(System.in)) {
            while (playAgain) {
                introduction();
                int limit = 100;
                int start = 1;
                boolean won = false;
                int attempts = 5;

                double correct_number = (int) (Math.random() * (limit)) + 1;
                for (int i = 0; i < attempts; i++) {

                    System.out.println("Guess left: " + (attempts - i));
                    System.out.print("Guess number between " + start + " and " + limit + ": ");
                    int guessed_number = sc.nextInt();
                    if (guessed_number > correct_number) {
                        System.out.println("High Guess, try again!");
                    } else if (guessed_number < correct_number) {
                        System.out.println("Low Guess, try again!");
                    } else if (guessed_number == correct_number) {
                        System.out.println("Yes, you guessed the number.. Congratulations!!");
                        won = true;
                        break;
                    }
                }
                if (!won)
                    System.out.println(
                            "Oops No more lifelines. Better luck next time. The correct number was: " + correct_number);

                System.out.print("Do you want to play again? (yes/no): ");
                String playChoice = sc.next().toLowerCase();
                playAgain = playChoice.equals("yes");
            }
            System.out.println("Thank you for playing! Goodbye.");
        }
    }
}

public class number_guessing {
    public static void main(String[] args) {
        Game g1 = new Game();
        g1.number_guessing();
    }
}
