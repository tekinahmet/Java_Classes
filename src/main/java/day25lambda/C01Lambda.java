package day25lambda;

import java.util.stream.IntStream;

public class C01Lambda {
    public static void main(String[] args) {
        System.out.println(findSumOfDigits(45, 47));
        System.out.println(sumOfTheSquareOfLastDigitsOfEvens(2, 6));

    }
    //Example 1:Create a method to calculate the sum of digits of every integer between given two integers
    //          45 46 47 ==? 4+5+4+6+4+7 = 30
    public static int findSumOfDigits(int s, int e){
        return IntStream.rangeClosed(s,e).map(Utils::getSumOfDigits).sum();
    }
    //Example 2: Create a method to calculate the sum of the squares of the last digit of even elements.

    public static int sumOfTheSquareOfLastDigitsOfEvens(int s, int e){
        return IntStream.rangeClosed(s,e).filter(t->t%2==0).map(t->t%10).map(t->t*t).sum();
    }




















}
