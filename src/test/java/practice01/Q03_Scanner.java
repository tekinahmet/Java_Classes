package practice01;

import java.util.Scanner;

public class Q03_Scanner {
    public static void main(String[] args) {
// Type a code that calculates the hypotenuse
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the lenght of one leg of the right triangle");
        double a = input.nextDouble();

        System.out.println("Enter the lenght of the second leg of the right triangle");
        double b = input.nextDouble();

        double c = Math.sqrt((a*a)+(b*b));
        System.out.println(c);
    }
}
