package day11arraylists_method_creation_method_overloading_varargs_pass_by_value;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C01ArrayLists {
    public static void main(String[] args) {
//        1.from a given list, find all pairs whose sum is a given number
       List<Integer> m = new ArrayList<>();
        m.add(4);
        m.add(6);
        m.add(5);
        m.add(-10);
        m.add(8);
        m.add(5);
        m.add(20);
        System.out.println(m);//[4, 6, 5, -10, 8, 5, 20]

        for(int i=0; i<m.size(); i++ ){
            for(int k=i+1; k<m.size(); k++){
                if( m.get(i) + m.get(k) == 10 ){
                    System.out.print(m.get(i) + " and " + m.get(k) + " & ");//4 and 6 & 5 and 5 & -10 and 20 &
                }
            }
        }
//        short syntax to create a List an add elements into it
        List<Integer> n = Arrays.asList(4, 6, 5, -10, 8, 5, 20);
        System.out.println(n);//[4, 6, 5, -10, 8, 5, 20]
        n.set(1, 22);
        System.out.println(n);//[4, 22, 5, -10, 8, 5, 20]

//        note: if you create a List by using Arrays.asList() method,
//        you cannot use the ArrayList methods change the number of elements
//        remove(), add(), clear(), cannot be used, but set() and size() can be used

        Collections.sort(n);
        System.out.println(n);//[-10, 4, 5, 5, 8, 20, 22]
    }
}
