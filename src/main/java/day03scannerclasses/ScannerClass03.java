package day03scannerclasses;

import java.util.Scanner;
public class ScannerClass03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String yourFullName=input.nextLine();

        System.out.println("Enter your age: ");
        byte yourAge = input.nextByte();

        System.out.println("Enter your height : ");
        float yourHeight = input.nextFloat();

        System.out.println("Are you married? ");
        boolean isMarried = input.nextBoolean();


        System.out.println("Your full name is "+ yourFullName);
        System.out.println("Your age is " + yourAge);
        System.out.println("Your height is " + yourHeight + " m ");
        System.out.println("Your Marital Status is " + isMarried);







    }
}
