package day22collections_maps;
import java.util.Arrays;
import java.util.HashMap;
public class Homework {

    public static void main(String[] args) {
/*
            Create a method to display the number of occurrences of letters in a sentence
            Java, Java, I love Java. ==> J=3, a=6, v=4, I=1, l=1, o=1, e=1
 */
        String str = "Java, Java, I love Java.";
        str = str.replaceAll("[^a-zA-Z]", "");
//        System.out.println(str);//JavaJavaIloveJava

        char[] strArray = str.toCharArray();
//        System.out.println(Arrays.toString(strArray));//[J, a, v, a, J, a, v, a, I, l, o, v, e, J, a, v, a]

        HashMap<Character, Integer> charOcc = new HashMap<>();
        for (char letter : strArray) {
            if (charOcc.containsKey(letter)) {
                charOcc.put(letter, charOcc.get(letter) + 1);
//                System.out.println(charOcc);
            } else {
                charOcc.put(letter, 1);
//                System.out.println(charOcc);
            }
        }
        System.out.println(charOcc);//{a=6, e=1, v=4, I=1, J=3, l=1, o=1}
    }
}

