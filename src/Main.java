import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name");
        String name;
        name = sc.nextLine();
        System.out.println("Hello,"  + name);

        System.out.println("Enter your Age");
        int a = sc.nextInt();
        System.out.println("Your age is " + a);
        sc.close();
        }
    }
