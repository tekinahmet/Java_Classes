package day03scannerclasses;

import java.util.Scanner;
public class ScannerClass01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.println("Enter second number: ");
        double num2 = input.nextDouble();

        System.out.println("The sum is: "+(num1+num2));
        System.out.println("The multiplication is: "+num1*num2);









    }
}
