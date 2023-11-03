package day06string_manipulations_loops;

public class C01StringManipulations {
    public static void main(String[] args) {
//Example 1: Make the all digits except last 4 digits of a credit card invisible by using '*'
//           1234 1234 1234 1234 ==> **** **** **** 1234
        String ccNum = "1234 1234 1234 1234";
        String first = ccNum.substring(0, 15).replaceAll("[0-9]", "*");
        System.out.println(first);//**** **** ****
        String result = ccNum.replaceAll("[ ]", "");

        String last = ccNum.substring(15);
        System.out.println(last);//1234

        String result1 = first + last;
        System.out.println(result1);//**** **** **** 1234
        System.out.println(first.concat(last));//**** **** **** 1234

        String numOfCharacters = "Tom Hanks was born in 1975.";
        int num = numOfCharacters.replaceAll("[\\s]","").length();
        System.out.println(num);//22

        int num2 = numOfCharacters.replace(" " , "").length();
        System.out.println(num2);//22

        /*
        1)concat() method is for joining two Strings like "+" sign

        2)replace(char, char) or replace(String, String): It is used to replace single character or multiple characters
          note: If you need to use Regular Expressions use replaceAll() otherwise use replace()
        */


    }
}