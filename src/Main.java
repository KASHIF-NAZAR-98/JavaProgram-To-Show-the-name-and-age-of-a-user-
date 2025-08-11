import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


//        Java Program to create signup for banks for users if different age and account

        Scanner age = new Scanner(System.in);
        System.out.println("Enter your Age");
        int yourAge = age.nextInt();


        if (yourAge < 21) {

            System.out.println("You are not eligible");

        }
        else if (yourAge > 21 && yourAge < 55){
            System.out.println("Savings Account ");
        }
        else if (yourAge > 55 ){

            System.out.println("Senior Citizen Account ");
        }







        }
    }
