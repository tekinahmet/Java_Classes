package day05ternarystatement_stringmanipulations;
public class C01TernaryOperator {
    public static void main(String[] args) {

//Example 1: Type code to check if an integer is even or odd
        int a = 12;
        String b = (a%2==0) ? "Even" : "Odd";
        System.out.println("1 : " + b);

//Example 2: Type code to check if an integer has 3 digits or not
        int c = 100;
        String d = ((c>99) && (c<1000)) ? "has three digits." : "hasn't three digits";
        System.out.println("2 : The integer " + d);

//Example 3: Type code to calculate absolute value of a number
//           5 ==> 5     0 ==> 0     -3 ==> -3*-1=3
        double e = 0;
        double f = (e<0)  ?  -1*e   :   e   ;
        System.out.println("3 : " + f);

//Example 4: Type code to find the multiplication of two integers if the signs are same.
//           Give a message like "I do not know how to multiply" if the signs are different.
//           5 and 4 ==> 5*4    -3 and -2 ==> -3*-2    -4 and 3 ==> "I do not know how to multiply"
        int g = 5;
        int h = -6;
        Object j = (g<0 && h<0)  || (g>0 && h>0) ? g*h : "I don tknow how to multply.";
        System.out.println(j);//I don tknow how to multply.

    }
}
