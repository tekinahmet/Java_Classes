package day05ternarystatement_stringmanipulations;
public class C03TernaryOperator {
    public static void main(String[] args) {
//Example 5: Type code to check if an integer is odd and if it is even it should be divisible 3.
//           7 ==> Odd    12 ==> Even ==> divisible by 3    14 ==> Even ==> Not divisible by 3
        int k = 26;
        String l = (k%2!=0) ? "Odd" : (k%3==0) ? "Even and divided by 3" : "Even but not divided by 3";
        System.out.println(l);//Even but not divided by 3

//Example 6(Interview Question):
//Type java code by using nested ternary.
//Write a program to check if a year is leap year or not.
//If the year is divisible by 100 then it must be divisible by 400. (2000+, 1800-)
//If a year is not divisible by 100 then it must be divisible by 4. (1996+, 2001-)
        int m = 1985;
        String n = (m%100==0) ? ((m%400==0) ? "Leap Year" : "Not Leap Year"): ((m%4==0) ? "Leap Year" : "Not Leap Year");
        System.out.println(n);//Not Leap Year

        int p = 2005;
        String result6 = (p%100==0 && p%400==0) || (p%100!=0 && p%4==0 ) ? "Leap year" : "Not leap year";
        System.out.println(result6);//Not Leap Year
    }
}
