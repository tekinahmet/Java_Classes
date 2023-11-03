package day02_datatypes;

import java.util.Scanner;
public class C05ScannerClass02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Type your name:"); //ahmet tekin
        String userName = input.nextLine();
        System.out.println(userName); //ahmet tekin

        System.out.println("Enter your parent's first name");//ramazan ayşe
        String parentFirstName = input.next();
        System.out.println(parentFirstName);//ramazan
    }
}
