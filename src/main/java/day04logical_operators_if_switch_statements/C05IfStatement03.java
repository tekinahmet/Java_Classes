package day04logical_operators_if_switch_statements;
import java.util.Scanner;
public class C05IfStatement03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type a name of a day: ");
        String dayName = input.next();

        boolean isWeekday = dayName.equalsIgnoreCase("Monday") ||
                            dayName.equalsIgnoreCase("Tuesday") ||
                            dayName.equalsIgnoreCase("Wednesday") ||
                            dayName.equalsIgnoreCase("Thursday") ||
                            dayName.equalsIgnoreCase("Friday");

        boolean isWeekend = dayName.equalsIgnoreCase("Saturday") ||
                            dayName.equalsIgnoreCase ("Sunday");

        if(isWeekend){
            System.out.println("Weekend");
        }else if(isWeekday){
            System.out.println("Weekday");
        }else{
            System.out.println("invalid");
        }
    }
}