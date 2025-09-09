import java.util.Scanner;

public class countingGame {
    public static void main(String[] args)  throws InterruptedException{

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many time start the counting?");
        int start = scanner.nextInt();

        for (int i = start; i > 0 ; i--)
        {
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("Let's start the Game!");

    }
}
