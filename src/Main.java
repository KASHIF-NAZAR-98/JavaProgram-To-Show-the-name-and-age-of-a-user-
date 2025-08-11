import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Java Program to create signup for banks for users of different age and account types

        Scanner age = new Scanner(System.in);
        System.out.println("Enter your Age");
        int yourAge = age.nextInt();

        if (yourAge < 21) {
            System.out.println("You are not eligible");
        }

        if (yourAge >= 21) {
            if (yourAge > 55) {
                System.out.println("Senior Citizen");
            } else if (yourAge <55) {
                System.out.println("Savings Account");
            }
        }

        age.close(); // always good practice to close the Scanner
    }
}
