package practice02;

import java.util.Scanner;

public class Q01_IfStatement_SalaryBonus {
    public static void main(String[] args) {

/*
    1. A company decided to give bonus of 5% of salary to the employee if his/her year of
        service is 5 and more than 5 years.
        Ask user for their salary and year of service and print the net bonus amount.
        If employee can not get bonus, print how many years he/she should work more.
        EXAMPLE:
        INPUT  :   Year     => 4 years service
        OUTPUT:   You need to work 1 more year(s) to get bonus
*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of the years of your job");
        int year = input.nextInt();

        System.out.println("Enter your salary");
        double salary = input.nextDouble();

        if(year>=5){
            double bonus = salary*5/100;
            System.out.println("Your bonus = " + bonus);
        }else {
            System.out.println("You need to work "+ (5-year) +" year(s) more to qualify for a bonus");
        }
    }
}

