package day04logical_operators_if_switch_statements;

import java.util.Scanner;

public class C08SwitchStatement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day number: ");
        int dayNum = input.nextInt();

        if (dayNum == 1) {
            System.out.println("Monday");
        } else if (dayNum == 2) {
            System.out.println("Tuesday");
        } else if (dayNum == 3) {
            System.out.println("Wednesday");
        } else if (dayNum == 4) {
            System.out.println("Thursday");
        } else if (dayNum == 5) {
            System.out.println("Friday");
        }else if (dayNum == 6) {
            System.out.println("Saturday");
        }else if (dayNum == 7) {
            System.out.println("Sunday");
        }else {
            System.out.println("invalid");
        }

        switch(dayNum){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("invalid");
        }
    }
}