package day03scannerclasses;

import java.util.Scanner;
public class ScannerClass04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5-digit number: ");//45678
        int myNum = input.nextInt();

        int firstTwo = myNum/1000;
        int lastTwo = myNum%100;

        System.out.println("The sum is " + (firstTwo+lastTwo));//123
    }
}
