package day19exceptions;
/*
1. Exceptions are strict rules in Java to protect developers from critical mistakes.
For example, you created a method uses division operation, and you are not good at math.
You think any number can be divided by any other number, but actually it is not.
Zero cannot be divisor in Math, when you mak zero divisor, Java will give you a message which explains the rule and stops the execution.
 */
public class C01Exceptions {
    public static void main(String[] args) {
        System.out.println(divide(6, 2));
        System.out.println(divide(0, 5));
        System.out.println(divide(12, 0));//Exception
//        ArithmeticException: Java throws ArithmeticException when you got a mistake in Math rules
        System.out.println("Hi");
        System.out.println(doDivision(12, 0));

        System.out.println(getNumOfChars("Java"));
        System.out.println(getNumOfChars(""));
        System.out.println(getNumOfChars(null));//Exception
//        NullPointerException: Java throws NullPointerException when you use "null" value for some String methods
    }

    //    1st Way to handle exceptions(not recommended)
    public static int divide(int a, int b) {//methods name should be verb
        if (b == 0) {
            return 0;
        }
        return a / b;
    }

    //    2nd Way to handle exceptions
    public static int doDivision(int a, int b) {//methods name should be verb
        int result =0;
        try{
            result = a/b;
            System.out.println("Hi Java");
        }catch(ArithmeticException e){
            result = 0;
        }
        return  result;
    }

//    Create a method to get the number of characters in a String
    public static int getNumOfChars(String s){
        if (s==null){
            return 0;
        }
        return s.length();
    }
    public static int getNumOfCharacters(String s) {
        int result = 0;
        try{
            result = s.length();
        }catch(NullPointerException e){
            result = 0;
        }
        return result;
    }
}
