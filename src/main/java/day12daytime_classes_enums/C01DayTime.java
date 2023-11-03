package day12daytime_classes_enums;

import java.time.*;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;


public class C01DayTime {
    public static void main(String[] args) {
/*
       LocalDate is an immutable date-time object that represents a date, often viewed as year-month-day.
       Other date fields, such as day-of-year, day-of-week and week-of-year, can also be accessed.
       For example, the value "2nd October 2007" can be stored in a LocalDate.
*/
        LocalDate myDate = LocalDate.now();
        System.out.println(myDate);//2023-07-18

/*
        This method adds the specified amount to the months field in three steps:
        Add the input months to the month-of-year field
        Check if the resulting date would be invalid
        Adjust the day-of-month to the last valid day if necessary
*/
        LocalDate yourDate = myDate.plusMonths(3).plusDays(11);
        System.out.println(yourDate);//2023-10-29

        LocalDate ourDate = myDate.minusYears(2).minusMonths(10).minusDays(45);
        System.out.println(ourDate);//2020-08-04

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM dd yyyy");
        System.out.println(dtf.format(myDate));//07 18 2023

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        System.out.println(dtf2.format(myDate));//18/Jul/2023

/*
        This method will create a formatter based on a simple pattern of letters and symbols as described in the class documentation.
        For example, d MMM uuuu will format 2011-12-03 as '3 Dec 2011'.
 */
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        System.out.println("dtf3.format(myDate) = " + dtf3.format(myDate.plusMonths(1)));//18 August 2023

//      A ZoneId is used to identify the rules used to convert between an Instant and a LocalDateTime.
        LocalDate dateInIstanbul = LocalDate.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(dateInIstanbul);//2023-07-18

//      Obtains the current time from the system clock in the default time-zone.
        LocalTime myTime = LocalTime.now();
        System.out.println(myTime);//17:42:25.051744200

        LocalTime yourTime = myTime.plusHours(1).plusMinutes(25).plusSeconds(13);
        System.out.println("yourTime = " + yourTime);//yourTime = 19:14:33.209012300

/*
        This subtracts the specified number of nanoseconds from this time, returning a new time.
        The calculation wraps around midnight.
*/
        LocalTime ourTime = myTime.minusNanos(2000);
        System.out.println("ourTime = " + ourTime);//ourTime = 17:50:21.141182200

        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("HH:mm ");
        String t1 = f1.format(myTime);
        System.out.println("f1 = " + t1);//f1 = 17:56

//        "a" stands for AM/PM
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println("f1 = " + f2.format(myTime));//f1 = 05:56 pm

        LocalTime timeInJapan = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("timeInJapan = " + timeInJapan);//00:03:20.487661600

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("currentDateTime = " + currentDateTime);//2023-07-18 T18:04:38.933210900

        System.out.println("currentDateTime.getMonth() = " + currentDateTime.getMonth());//JULY
        System.out.println("currentDateTime.getDayOfMonth() = " + currentDateTime.getDayOfMonth());//18

/*
       4.  If the given date is before the current date give message to user like "Invalid date"
       If the given date equals the current date give message to user like "Give the time"
       If the time is before current time tell to user "No ticket"
       otherwise tell to user "There is just 1 ticket"
       If the given date is after the current date give message to user like "Buy the ticket"
*/
        Scanner input = new Scanner(System.in);

        System.out.println("Enter year, month, day values : ");
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();
        LocalDate givenDate = LocalDate.of(year, month, day);
        LocalDate currentDate = LocalDate.now();

        System.out.println("Enter hour and minute");
        int hour = input.nextInt();
        int minute = input.nextInt();
        LocalTime givenTime = LocalTime.of(hour, minute);
        LocalTime currentTime = LocalTime.now();

        if(givenDate.isBefore(currentDate)){
            System.out.println("Invalid date");
        }else if(givenDate.isEqual(currentDate)){
            if(givenTime.isBefore(currentTime)){
                System.out.println("No ticket");
            }else{
                System.out.println("There is just 1 ticket");
            }
        }else if(givenDate.isAfter(currentDate)){
            System.out.println("Buy the ticket");
        }
    }
}
