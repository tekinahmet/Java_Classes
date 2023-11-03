package day12daytime_classes_enums;

import java.util.Scanner;

public class EnumRunner {
    public static void main(String[] args) {
        String capital = UsStates.MASSACHUSETTS.getCapitalCity();
        System.out.println(capital);//Boston

        String abb = UsStates.ALASKA.getAbbreviation();
        System.out.println(abb);//AK

        String abbreviation = UsStates.CALIFORNIA.getAbbreviation();
        System.out.println(abbreviation);//CA

        System.out.println(UsStates.ALABAMA.getStateName());//Alabama
        System.out.println(UsStates.ALABAMA);//ALABAMA

//        Ask user to enter state name then give user capital city.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter state name");
        String state = input.nextLine().toUpperCase();

        switch(state){

            case "ALABAMA":
                System.out.println(UsStates.ALABAMA.getCapitalCity());
                break;
            case "ALASKA":
                System.out.println(UsStates.ALASKA.getCapitalCity());
                break;
            case "AMERICAN SAMOA":
                System.out.println(UsStates.AMERICAN_SAMOA.getCapitalCity());
                break;
            case "ARIZONA":
                System.out.println(UsStates.ARIZONA.getCapitalCity());
                break;
            case "ARKANSAS":
                System.out.println(UsStates.ARKANSAS.getCapitalCity());
                break;
            default:
                System.out.println("Invalid state name");
        }
    }
}
