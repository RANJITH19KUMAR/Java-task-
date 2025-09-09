import java.util.Scanner;

public class switchs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String day;

        System.out.print("Enter the week of the day:");
        day = scanner.nextLine();

        switch (day){
            case "Monday","Tuesday","Wednesday","Thursday","Friday" ->
                    System.out.println("It is the weekday");
            case "Saturday","Sunday" -> System.out.println("It is the weekend day");
        }

    }
}
