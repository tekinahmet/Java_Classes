package day09arrays_foreach_loop;

import java.util.Arrays;

public class C03Arrays {
    public static void main(String[] args) {
//        1.create an integer array and print all the elements less than 5
        int[] n = {12, 3, -3, 5, 23};
        for(int w : n) {
            if (w < 5) {
                System.out.print(w + " ");//3 -3
            }
        }
        System.out.println();
//        2.check if a specific element exists in an array or not. ==> binarySearch()
        //binarySearch() ===> gives you the index of an "existing element" with positive number.
        //binarySearch() ===> gives you the order of an "non-existing element" with negative number
        //                    as if it wouldhave been in the array.
        //binarySearch() ===> cannot be used with repeated elements
        int[] h = {12, 3, 14, 5, 23};
        Arrays.sort(h);

        Arrays.sort(h);
        System.out.println(Arrays.toString(h));//[3, 5, 12, 14, 23]

        int output = Arrays.binarySearch(h, 23);
        System.out.println(output);//1

        int noChar = Arrays.binarySearch(h,11);
        System.out.println(noChar);//-3



























    }
}
