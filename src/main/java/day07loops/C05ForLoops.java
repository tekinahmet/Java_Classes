package day07loops;

import java.util.Scanner;

public class C05ForLoops {
    public static void main(String[] args) {
//           Type code to print fibonacci numbers, the number of fibonacci numbers will be given by user
//           The user gave 6 ==> 1 1 2 3 5 8

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int user = input.nextInt();

        int fibo1 = 1;
        int fibo2 = 1;
        int fibo = 0;

        System.out.print(fibo1 + " ");
        System.out.print(fibo2 + " ");

        for (int i = 1; i < user - 1; i++) {
            fibo = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibo;
            System.out.print(fibo + " ");
        }//1 1 2 3 5 8 for 6
    }
}
