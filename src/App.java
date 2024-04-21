import java.util.Random;
import java.util.Scanner;
public class App {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            int round = 1;
            int attempt = 1;
            int Win_score = 0;
            System.out.println("*********** THE NUMBER GAME ***********");
            System.out.println("Basic Instructions : ");
            System.out.println("You can play any number of rounds. ");
            System.out.println("Each round you get a maximum of 5 attempts. ");
            System.out.println();
            System.out.println("Let the game begin !!");
            System.out.println();
    
            while (true) {
                
                System.out.println("Round " + round);
                attempt = 1;
                int generatedNumber = random.nextInt(101);
                
                System.out.println("Guess the random number between 0 and 100 .");
    
                while (true) {
                    System.out.printf("Attempt %d: ", attempt);
                    int guessed_number = scanner.nextInt();
                    if (guessed_number < generatedNumber) {
                        System.out.println("The number you have guessed is low! Try again.");
                    } else if (guessed_number > generatedNumber) {
                        System.out.println("The number you have guessed is high! Try again.");
                    } else {
                        System.out.println("Congratulations! You've guessed the correct number.");
                        Win_score++;
                        break;
                    }
                    attempt++;
                    if (attempt > 5) {
                        System.out.println("You've exceede the number of attempts. The correct number was " + generatedNumber);
                        break;
                    }
                }
    
                System.out.println("Do you want to play again? (yes/no)");
                String playAgain = scanner.next();
                if ((!playAgain.equalsIgnoreCase("yes"))) {
                    break;
                }
                round++;
            }
    
            System.out.println("Your final score: " + Win_score + " out of " + round + " rounds.");
            scanner.close();
        }
    }

