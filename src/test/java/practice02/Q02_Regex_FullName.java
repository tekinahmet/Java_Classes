package practice02;

import java.util.Scanner;

public class Q02_Regex_FullName {
    public static void main(String[] args) {
/*
        Divide the 2-word name and surname you will receive from the user into separate words.
        Print the name and surname on the screen separately.
     EXAMPLE:
        INPUT: John Doe
        OUTPUT:
                First name: John
                Surname: Doe
 */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name with a space between them");
        String fullName = input.nextLine().replaceAll("\\s+"," ").
                replaceAll("[^A-Za-z ]", "").trim();

//      "\\s+" means one space and more if threre is one

        System.out.println("fullName = " + fullName);

        String firstName = fullName.split(" ")[0].substring(0,1).toUpperCase()
                + fullName.split(" ")[0].substring(1).toLowerCase();
        System.out.println("firstName = " + firstName);

        String secondName = fullName.split(" ")[1].substring(0,1).toUpperCase()
                + fullName.split(" ")[1].substring(1).toLowerCase();
        System.out.println("secondName = " + secondName);

        System.out.println("firstName = " + firstName + "\nsecondName = " + secondName);
    }
}
