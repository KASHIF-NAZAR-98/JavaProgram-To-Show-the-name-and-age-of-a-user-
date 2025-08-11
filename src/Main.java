import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        int a , b ,temp;
        Scanner value = new Scanner(System.in);
        System.out.println("Enter two variables values");
        a =value.nextInt();
        b=value.nextInt();

        temp =b ;
        b =a ;
        a = temp;
        System.out.println("The value of first var is now " + a);
        System.out.println("The value of Second var is now " + b);



        }
    }
