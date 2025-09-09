import java.util.Scanner;

public class timescompounded {
    public static void main(String[] args) {

        //Compounded Intrest Calculator Program

        Scanner scanner=new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount:");
        principal=scanner.nextDouble();

        System.out.print("Enter the interst rate(in %):");
        rate=scanner.nextDouble() / 100;

        System.out.print("Enter # of timesCompounded per years:");
        timesCompounded=scanner.nextInt();

        System.out.print("Enter the # of years:");
        years=scanner.nextInt();

        amount=principal * Math.pow(1 + rate/timesCompounded, timesCompounded * years);

        System.out.printf("The amount after %d year is:$ %.2f",years,amount );

        scanner.close();

    }
}
