package day04logical_operators_if_switch_statements;

import java.util.Scanner;

public class C06IfStatement04 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("what is my mark?");

        int myMark = input.nextInt();
        if(myMark<0){
            System.out.println("Negative marks are not valid!");
        } else if (myMark<50) {
            System.out.println("D");
        }else if(myMark<60){
            System.out.println("C");
        }else if(myMark<80){
            System.out.println("B");
        }else if(myMark<=100){
            System.out.println("A");
        }else{
            System.out.println("Invalid Mark");
        }
    }
}
