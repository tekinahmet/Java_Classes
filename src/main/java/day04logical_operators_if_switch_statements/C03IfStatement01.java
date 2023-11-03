package day04logical_operators_if_switch_statements;
import java.util.Scanner;
public class C03IfStatement01 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        if (a % b == 1) {
            System.out.println("Activated");
        }//executed because it is true.

        if (a % b == 2) {
            System.out.println("Activated");
        }//not executed because it is false.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        int myNum = input.nextInt();
        if (myNum % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        System.out.println("Enter a number: ");
        double num = input.nextDouble();
        if (num > 0) {
            System.out.println("Positive");
        } else if (num == 0) {
            System.out.println("Neutral");
        } else {
            System.out.println("Negative");
        }
    }
}