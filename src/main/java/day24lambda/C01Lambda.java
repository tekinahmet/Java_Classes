package day24lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class C01Lambda {

    // create a method to calculate the "sum" of the "squares" of "distinct" "even" elements

    public static int sumOfSquaresOfDistinctEvens(List<Integer> list){
        return list.
                stream().
                distinct().
                filter(t->t%2==0).
                map(t->t*t).
                reduce(0,(t,u)->t+u);
    }
    // create a method to calculate the "multiplication" of the "last digit" of "distinct" "odd"
    public static int multiplyLastDigitOfDistinctOdd(List<Integer> list){
        return list.
                stream().
                distinct().
                filter(t->t%2==1).
                map(t->t%10).
                reduce(1,(t,u)->t*u);
    }
    //find the maximum from the list
    public static int getMaxOne(List<Integer> list){
        return list.
                stream().
                distinct().
                reduce(list.get(0), (t,u)-> t>u ? t : u);
    }
    //Put the elements in ascending order then the last element will be the maximum
    public static int getMaximumNum(List<Integer> list){
       // return list.stream().distinct().sorted().reduce(1,(t,u)->t>u ? t : u);
        return list.
                stream().
                distinct().
                sorted().
                reduce((t,u)->u).get();
    }
    //Put the elements in descending order then the first element will be the maximum
    public static int findFirstElementMax(List<Integer> list){
        return list.
                stream().
                distinct().
                sorted(Comparator.reverseOrder()).
                findFirst().
                get();
        //return list.stream().distinct().min(Comparator.reverseOrder()).get();
    }
    //Create a method to find the minimum value which is greater than 7 and even from the list
    public static int findMinEvenGreaterThanSeven(List<Integer> list){
        return list.
                stream().
                distinct().
                filter(t->t>7).
                filter(t->t%2==0).
                sorted().
                findFirst().
                get();//filter(t->t>7 && t%2==0).
    }
    public static int findMax1(List<Integer> list){

        return list.
                stream().
                distinct().
                reduce(list.get(0), (t,u)->Math.max(t,u));
    }
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(17);
        nums.add(4);
        nums.add(12);
        nums.add(15);
        System.out.println(sumOfSquaresOfDistinctEvens(nums));//356
        System.out.println(multiplyLastDigitOfDistinctOdd(nums));//315
        System.out.println(getMaxOne(nums));//131
        System.out.println(getMaximumNum(nums));//131
        System.out.println(findFirstElementMax(nums));//131
        System.out.println(findMinEvenGreaterThanSeven(nums));//12
        System.out.println("findMax1(nums) = " + findMax1(nums));
    }
}
