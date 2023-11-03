package day06string_manipulations_loops;
public class C05StringManipulations {
    public static void main(String[] args) {
//        Type a code to find the number of punctuation marks used in a String.

        String s = "Wooow!... Tom is 13, and he is in university...????";
        System.out.println(s.replaceAll("[^\\p{Punct}]", "").length());//12

        String t = "Learn Java, earn money";
        System.out.println(t.replaceAll("[^ ]", "").length() + 1);//4

        System.out.println(t.split(" ").length);//4

        String s2 = "Wooow!... Tom is 13, and he is in university...????";
        System.out.println(s2.replaceAll("[^A-Za-z]", "").length());
    }
}
