package practice01;

import java.util.Scanner;

public class Q02_Scanner {
    public static void main(String[] args) {
         /*Task: Ask user to enter his/her first name, age, height, and weight then print them on the console in this way:
    First Name: …..
    Last Name: …..
    Age: …….
    Height: …….
    Weight: ……..
    Note: Use only on “System.out.println();”
     */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name please");
        String firstName = input.nextLine();

        System.out.println("Enter your second name please");
        String lastName = input.nextLine();

        System.out.println("Enter your age");
        int age = input.nextInt();

        System.out.println("Enter your height");
        double height = input.nextDouble();

        System.out.println("Enter your weight");
        double weight = input.nextDouble();

        System.out.print("First Name: " + firstName + "\n Last Name: " + lastName + "\n Age: " + age + "\n Height: "+ height+ "\n Weight: "+ weight);


    }
}
