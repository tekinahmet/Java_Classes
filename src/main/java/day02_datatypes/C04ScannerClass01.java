package day02_datatypes;

import java.util.Scanner;
public class C04ScannerClass01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");

        int userAge = input.nextInt();

        System.out.println(userAge);
    }

}
