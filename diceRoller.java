import java.util.Random;
import java.util.Scanner;

public class diceRoller {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Random random = new Random();

        boolean playAgain=true;
        int numOfDice;
        int total = 0;



        while (playAgain) {


            System.out.print("Enter the # of dice roll:");
            numOfDice = scanner.nextInt();

            if ( numOfDice > 0) {
                for (int i = 0; i <= numOfDice; i++) {
                    int roll = random.nextInt(1, 7);
                    printDie(roll);
                    System.out.println("You rolled:" + roll);
                    total += roll;
                }
                System.out.println("Total: " + total);
            } else {
                System.out.println("# of dice must be grater than 0");
            }
            System.out.print("Do you want to roll again?(Yes/No):");
            String answer = scanner.next();

            if (!answer.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }
            scanner.close();
        }

        static void printDie (int roll){

            String dice1 = """
                     ------
                    |     |
                    |  ●  |
                    |     |
                     ------
                    """;
            String dice2 = """
                     ------
                    |●    |
                    |  ●  |
                    |     |
                     ------
                    """;
            String dice3 = """
                     ------
                    |●     |
                    |   ●  |
                    |     ●|
                     ------
                    """;
            String dice4 = """
                     ------
                    |●    ●|
                    |      |
                    |●    ●|
                     ------
                    """;
            String dice5 = """
                     ------
                    |●    ●|
                    |   ●  |
                    |●    ●|
                     ------
                    """;
            String dice6 = """
                     ------
                    |●    ●|
                    |●    ●|
                    |●    ●|
                     ------
                    """;

            switch (roll) {
                case 1 -> System.out.println(dice1);
                case 2 -> System.out.println(dice2);
                case 3 -> System.out.println(dice3);
                case 4 -> System.out.println(dice4);
                case 5 -> System.out.println(dice5);
                case 6 -> System.out.println(dice6);

                default -> System.out.println("Invalid Roll!");

            }
        }

    }

