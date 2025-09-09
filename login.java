import java.util.Scanner;

public class login {
    public static void main(String[] args) {

        //Username andPassword checking in special characters and Accepted

        Scanner scanner = new Scanner(System.in);
        String username;
        String password;

        while (true){
            System.out.print("Enter your username:");
            username = scanner.nextLine();

            System.out.print("Enter your password:");
            password = scanner.nextLine();

            if (username.length() < 1 || username.length() > 12) {
                System.out.println("Username must be between 1-12");
            } else if (password.length() < 1 || password.length() > 8) {
                System.out.println("Password must be between 1-8 ");
            } else if (!password.matches(".*[^a-zA-Z0-9].*")) {
                System.out.println("password must be contain atleast one special character!");
            }

            else {
                System.out.println("Welcome " + username + "!");
                System.out.println("Password Accepted!");
                break;
            }

        }


            scanner.close();

    }

}
