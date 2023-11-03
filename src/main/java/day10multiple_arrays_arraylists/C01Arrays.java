package day10multiple_arrays_arraylists;

import java.util.Arrays;

public class C01Arrays {
    public static void main(String[] args) {
//        .split() method in String class returns Array
        String s= "Learn Java earn money";
        String[] s1 = s.split("a");
        System.out.println(Arrays.toString(s1));//[Le, rn J, v,  e, rn money]

//        Arrays.equals () method is used to check if two Arrays are same or not.

        int[] a = {2, 5, 1};
        int[] b = {2, 5, 1};
        boolean t = Arrays.equals(a, b);
        System.out.println(t);//true
    }
}
