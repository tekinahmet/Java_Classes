package day03scannerclasses;

import java.util.Scanner;
public class ScannerClass02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the width and the lenght of the rectangle: ");

        double width = input.nextDouble();

        double lenght = input.nextDouble();

        System.out.println("The area of the rectangle: " + 2*(width*lenght));

    }
}
