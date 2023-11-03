package day22collections_maps;
import java.util.Arrays;
import java.util.HashMap;
public class C03Maps {
    public static void main(String[] args) {
/*
        1. Type code to find the number of occurrences of words in a sentence
        Java is easy, Java is OOP, OOP makes Java easy.
        ==> Java=3, is=2, easy=2, oop=2, makes=1
*/
            String s = "Java is easy, Java is OOP, OOP makes Java easy";
        System.out.println(s);

            s = s.replaceAll("\\p{Punct}", "");
        System.out.println(s);// Java is easy Java is OOP OOP makes Java easy

//        create a map
        HashMap<String, Integer> occ = new HashMap<>();

//        get the words from the String by using split(" ")
            String[] words = s.split(" ");
        System.out.println(Arrays.toString(words));//[Java, is, easy, Java, is, OOP, OOP, makes, Java, easy]

//        put the words in the map by counting
            for(String w : words) {
                Integer numOfOcc = occ.get(w);
                if (numOfOcc==null){
                    occ.put(w,1);
                }else {
//                    occ.put(w,numOfOcc+1);
                    occ.replace(w,numOfOcc+1);
            }
        }System.out.println(occ);//{Java=3, OOP=2, makes=1, is=2, easy=2}
    }
}
