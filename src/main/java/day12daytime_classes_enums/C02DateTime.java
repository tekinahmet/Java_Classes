package day12daytime_classes_enums;

import java.time.LocalDate;
import java.util.Scanner;

public class C02DateTime {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your date of birth");

        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();

        LocalDate dob = LocalDate.of(year, month, day);
        System.out.println("You were born on " + dob.getDayOfWeek());
    }
}
