package day04logical_operators_if_switch_statements;

import java.util.Scanner;

public class C04IfStatement02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter initials of the names of the days: ");
        char dayNameInitial = input.next().charAt(0);

        if(dayNameInitial=='S' || dayNameInitial=='s'){
            System.out.println("Sunday, Saturday");
        }else if(dayNameInitial=='T'|| dayNameInitial=='t'){
            System.out.println("Tuesday, Thursday");
        }else if(dayNameInitial=='M'|| dayNameInitial=='m'){
            System.out.println("Monday");
        }else if(dayNameInitial=='W'|| dayNameInitial=='w'){
            System.out.println("Wednesday");
        }else if(dayNameInitial=='F'|| dayNameInitial=='f'){
            System.out.println("Friday");
        } else{
            System.out.println("No day like this");
        }
    }
}
