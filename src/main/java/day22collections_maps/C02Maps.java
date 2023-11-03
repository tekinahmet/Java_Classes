package day22collections_maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C02Maps {
    public static void main(String[] args) {
        HashMap<String, Integer> stdAges = new HashMap<>();
            stdAges.put("Tom",76);//Tom is key, 79 is value
            stdAges.put("Angelina",55);
            stdAges.put("Brad",61);
            stdAges.put("Leo",43);
            stdAges.put("Linda",23);
            stdAges.put("Brad",34);
        System.out.println(stdAges);//{Tom=76, Angelina=55, Leo=43, Brad=34, Linda=23}

//      How to work with just keys
//      get the total number of the characters in student names
            Set<String> keys = stdAges.keySet();
        System.out.println(keys);//[Tom, Angelina, Leo, Brad, Linda]
            int numOfChars = 0;
            for (String w:keys) {
                numOfChars+=w.length();
            }
        System.out.println(numOfChars);//23

//      How to work with just keys
//      find the average age of the students
        Collection<Integer> ages = stdAges.values();
        System.out.println(ages);//[76, 55, 43, 34, 23]

            double sumOfAge = 0;
            for(Integer w:ages){
                sumOfAge+=w;
            }
        System.out.println("Average age is " + sumOfAge/ages.size());//Average age is 46.2

//      How to loop with entries
//      find the sum of the number of characters and the age for every entry
        Set<Map.Entry<String, Integer>> entries = stdAges.entrySet();
        System.out.println(entries);//[Tom=76, Angelina=55, Leo=43, Brad=34, Linda=23]

            for (Map.Entry<String, Integer> w:entries) {
                int sum = w.getKey().length()+w.getValue();
                System.out.println("For " + w.getKey() + " : " + sum);
            }
/*
        For Tom : 79
        For Angelina : 63
        For Leo : 46
        For Brad : 38
        For Linda : 28
*/
            int age1 = stdAges.get("Angelina");
        System.out.println(age1);//55

            stdAges.putIfAbsent("Angelina", 67);
            stdAges.putIfAbsent("Carl", 16);
        System.out.println(stdAges);//{Tom=76, Angelina=55, Leo=43, Carl=16, Brad=34, Linda=23}

            stdAges.replace("Angelina", 67);//preferable for updating values
            stdAges.put("Angelina", 67);
        System.out.println(stdAges);//{Tom=76, Angelina=67, Leo=43, Carl=16, Brad=34, Linda=23}

            stdAges.replace("Angelina", 44, 100);
        System.out.println(stdAges);//{Tom=76, Angelina=67, Leo=43, Carl=16, Brad=34, Linda=23}

            stdAges.replace("Angelina", 67, 100);
        System.out.println(stdAges);//{Tom=76, Angelina=100, Leo=43, Carl=16, Brad=34, Linda=23}

            boolean r1 = stdAges.containsKey("Brad");
        System.out.println(r1);//true

            boolean r2 = stdAges.containsKey("X");
        System.out.println(r2);//false

            boolean r3 = stdAges.containsKey(51);
        System.out.println(r3);//false

        System.out.println(stdAges.getOrDefault("Tom", 0));//76
        System.out.println(stdAges.getOrDefault("X", 0));//0

            stdAges.remove("Tom");
        System.out.println(stdAges);//{Angelina=100, Leo=43, Carl=16, Brad=34, Linda=23}

            stdAges.remove("Leo", 43);
        System.out.println(stdAges);//{Angelina=100, Carl=16, Brad=34, Linda=23}
    }
}
