package day04logical_operators_if_switch_statements;

import java.util.Scanner;

public class C07IfStatement05 {
//Example 6: If a number is even then check if it is divisible by 3 or not.
// If it is divisible by 3 the output will be
//"Perfect even number" otherwise, the output will be "Good even number."
//If the number is odd then check if it is divisible by 3 or not.
// If it is divisible by 3 the output will be
//"Perfect odd number" otherwise, the output will be "Good odd number."
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter an integer: ");
        int num = input.nextInt();
        if(num%2==0){
            if(num%3==0){
                System.out.println("Perfect");
            }else{
                System.out.println("Good");
            }
        }else{
            if(num%3==0){
                System.out.println("Welldone");
            }else{
                System.out.println("So-so");
            }
        }
    }
}
