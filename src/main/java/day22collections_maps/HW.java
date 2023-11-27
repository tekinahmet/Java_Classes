package day22collections_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class HW {
    public static void main(String[] args) {
        String str = "Hello Henry";
        str = str.replaceAll(" ", "");
        String[] words = str.split("");
        System.out.println("words = " + Arrays.toString(words));//words = [Hello, Henry]

        TreeMap<String, Integer> occ = new TreeMap<>();//to put them into natural order

        for (String each:words) {
            Integer numOfOcc = occ.get(each);
            if (numOfOcc == null) {
                occ.put(each, 1);
            }else {
                occ.replace(each, numOfOcc+1);
            }
        }System.out.println("occ = " + occ);//occ = {H=2, e=2, l=2, n=1, o=1, r=1, y=1}
    }
}
