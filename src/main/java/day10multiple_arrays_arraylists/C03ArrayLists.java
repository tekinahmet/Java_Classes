package day10multiple_arrays_arraylists;

import java.util.ArrayList;

public class C03ArrayLists {
    public static void main(String[] args) {
        /*
        -It is impossible to create an Array without declaring the number of elements in it.
        -This is not good, because it is impossible to decide the number of the elements put
        into an array at the beginning.
        -Arrays are fixed in length, this creates issues in implementation,
        that's why Java created another structure which is flexible in length.
        its name is "ArrayList".
        -Arrays use primitives and references, but ArrayList use just non-primitives
        -Why did not Java remove Arrays after creating ArrayLists?
                1.Arrays are so fast
                2.Arrays use memory so less
        -ArrayLists are for storing multiple data in the same data type with flexible length.
         -ArrayList do not except primitives in elements, use non-primitives
         */

//        how to create an ArrayList
        ArrayList<Integer> m = new ArrayList<>();

//        how to print ArrayLists
        System.out.println(m);//[]

//        how to add elements into  an ArrayLists (List)
        m.add(12);
        m.add(5);
        m.add(9);// add(element) method adds the elements to the end.
        m.add(2,10);// add(given index, element) adds them to the given index
        System.out.println(m);//[12, 3, 5, 9]

        ArrayList<Integer> n = new ArrayList<>();
        n.add(99);
        n.add(88);
        n.add(77);
        System.out.println(n);//[99, 88, 77]

        m.addAll(n);
        System.out.println(m);//[12, 5, 10, 9, 99, 88, 77]

        m.addAll(2,n);
        System.out.println(m);//[12, 5, 99, 88, 77, 10, 9, 99, 88, 77]

//        1.create an Integer ArrayList and change the odd ones to 11
        ArrayList<Integer> p = new ArrayList<>();
        p.add(23);
        p.add(24);
        p.add(12);
        p.add(9);
        p.add(3);
        System.out.println(p);//[23, 24, 12, 9, 3]

        for(Integer w : p){
            if(w%2!=0){
                p.set(p.indexOf(w), 11);//-1 if this list does not contain the element.
            }
        }
        System.out.println(p);//[11, 24, 12, 11, 11]

//        2.create a String ArrayList and remove the elements contain "a"
        ArrayList<String> r = new ArrayList<>();
        r.add("Miami");
        r.add("New York");
        r.add("Tampa");
        r.add("Virginia");
        System.out.println(r);//[Miami, New York, Tampa, Virginia]

        for(int i=0; i<r.size(); i++){
//  Returns the number of elements in this list.

            if(r.get(i).contains("a")){
//  Returns the element at the specified position in this list.

                r.remove(r.get(i));
//  Removes the first occurrence of the specified element from this list,
//  If the list does not contain the element, it is unchanged.

               // r.remove(i);//Object o
//  Removes the element at the specified position in this list.

                i--;
            }
        }
        System.out.println(r);//[New York]
    }
}
