import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {

        //Questions Array
        String[] questions = {"Year of India Independent?", "India capital?", "Tamil nadu which country?", "Java is?", "Current year?"};

        // OPTIONS ARRAY[][]
        String[][] options = {{"1.1982", "2.1946", "3.1947", "4.1950"},
                {"1.Chennai", "2.New Delhi", "3.Hyderabad", "4.Kerala"},
                {"1.India", "2.USA", "3.Uk", "4.Aus"},
                {"1.Programming language", "2.Quick compiler", "3.indian language", "4.1&2 is Correct"},
                {"1.2023", "2.2035", "3.2025", "4.2052"}
        };
        // DECLARE VARIABLES

        int[] answers = {3, 2, 1, 4, 3};
        int guess;
        int score = 0;

            //WELCOME MESSAGE
            Scanner scanner = new Scanner(System.in);

            System.out.println("-------------------------");
            System.out.println("Welcome to the Java Quiz!");
            System.out.println("-------------------------");

            //QUESTIONS (LOOOP)
            for (int i = 0; i < questions.length; i++) {
                System.out.println(questions[i]);


                for (String option : options[i]) {
                    System.out.println(option);

                }
                //GET GUESS FROM USER

                System.out.print("Enter your Guess:");
                guess = scanner.nextInt();

                if (guess == answers[i]) {
                    System.out.println("----------------");
                    System.out.println("CORRECT!");
                    System.out.println("----------------");
                    score++;
                } else {
                    System.out.println("----------------");
                    System.out.println("WRONG!");
                    System.out.println("----------------");
                }
            }
            // FINAL SCORE CHECK
            System.out.println("Final score is: " + score + " out of " + questions.length);


        }
    }

