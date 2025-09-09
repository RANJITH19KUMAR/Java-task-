import java.util.Random;
import java.util.Scanner;

public class slot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //DECLARE VARIABLES
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain;

        // WELCOME MESSAGE

        System.out.println("---------------------");
        System.out.println("Welcome to Java slots");
        System.out.println("Symbols: 🍉🍍🥭🍒🍓");
        System.out.println("---------------------");

        // Play if balance > 0

        while (balance > 0)
        // ENTER BET AMOUNT
        {
            System.out.println("Current balance:Rs " + balance);
            System.out.print("Place your bet amount:");
            bet = scanner.nextInt();
            scanner.nextLine();


            // VERIFY IF BET > BALANCE
            //VERIFY IF BET <= 0
            //SUBSTRACT BET FROM BALANCE

            if (bet > balance) {
                System.out.println("Insufficient Funds!");
                continue;
            } else if (bet <= 0) {
                System.out.println("Bet must be greater than 0");
                continue;
            } else {
                balance -= bet;
            }

            System.out.println("Spinning...");
            row = spinRow();
            printRow(row);
            payout = getPayout(row,bet);

            if (payout >0){
                System.out.println("You won :Rs." + payout);
                balance += payout;
            }
            else {
                System.out.println("You lose this round");
            }

            System.out.print("Do you want to playagain(Y/N):");
            playAgain = scanner.nextLine().toUpperCase();

            if (!playAgain.equals("Y")){
                break;
            }
        }
        System.out.println("Game Over! Your Final balance " +balance);

        scanner.close();
    }


    static String[] spinRow() {
        String[] symbols = {"🍉", "🍍", "🥭", "🍒", "🍓"};
        String[] row = new String[3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            int length = symbols.length;
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        System.out.println(row[0] + row[1] + row[2]);
        return row;

    }

    static void printRow(String[] row) {
        System.out.println("----------------------------------");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("----------------------------------");
    }

    static int getPayout(String[] row, int bet) {
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return  switch (row[0]){
                case "🍉" -> bet * 3;
                case "🍍" -> bet * 4;
                case "🥭" -> bet * 5;
                case "🍒" -> bet * 6;
                case "🍓" -> bet * 7;
                default -> 0;
            };
        } else if (row[0].equals(row[1])) {
            return  switch (row[0]){
                case "🍉" -> bet * 4;
                case "🍍" -> bet * 5;
                case "🥭" -> bet * 6;
                case "🍒" -> bet * 7;
                case "🍓" -> bet * 8;
                default -> 0;
            };
        }
        else if (row[1].equals(row[2])) {
            return  switch (row[1]){
                case "🍉" -> bet * 5;
                case "🍍" -> bet * 6;
                case "🥭" -> bet * 7;
                case "🍒" -> bet * 8;
                case "🍓" -> bet * 9;
                default -> 0;
            };
        }
        return bet;
    }
}