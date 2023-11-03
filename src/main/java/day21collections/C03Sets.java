package day21collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class C03Sets {
    /*
    1. Sets are used to store multiple but UNIQUE data.
    2. Hashing technique is used in Sets to make data unique.
    3. There are three types of Sets:
                    i. HashSet:
                            ---is used for storing unique data.
                            ---put the elements in random order
                            ---works faster because of random order of elements
                            ---excepts null as value
                    ii. LinkedHashSet:
                            ---is used for storing unique data.
                            ---puts the elements in insertion order.
                    iii. TreeSet:
                            ---is used for storing unique data.
                            ---does not accept null as a value.
                            ---puts the elements in "natural order" (alphabetical order for String)
                            ---puts the elements in "natural order" (ascending order for numbers)
                            ---works so slow because it has to perform extra work while putting the elements in the natural order.
     */
    public static void main(String[] args) {
        long t1 = System.nanoTime();

        HashSet<String> emails = new HashSet<>();
        emails.add("xy@gmail.com");
        emails.add("as@gmail.com");
        emails.add("zx@gmail.com");
        emails.add("qw@gmail.com");
        emails.add("ty@gmail.com");
        emails.add(null);
        emails.add(null);//does not accept the second one.
        System.out.println(emails);//[null, as@gmail.com, xy@gmail.com, qw@gmail.com, ty@gmail.com, zx@gmail.com]

        long t2 = System.nanoTime();

        LinkedHashSet<String> ids = new LinkedHashSet<>();
        ids.add("xy@gmail.com");
        ids.add("as@gmail.com");
        ids.add("zx@gmail.com");
        ids.add("qw@gmail.com");
        ids.add("ty@gmail.com");
        ids.add(null);
        ids.add(null);//does not accept the second one.
        System.out.println(ids);

        long t3 = System.nanoTime();

        TreeSet<String> ssn = new TreeSet<>();
        ssn.add("xy@gmail.com");
        ssn.add("as@gmail.com");
        ssn.add("zx@gmail.com");
        ssn.add("qw@gmail.com");
        ssn.add("ty@gmail.com");
//        ssn.add(null);
        System.out.println(ssn);//NullPointerException

//        I use HashSet to store the data faster, and then I can add that HashSet in my
//        TreeSet to put it in natural order.

        long t4 = System.nanoTime();

        HashSet<String> stdIds = new HashSet<>();
        stdIds.add("xy@gmail.com");
        stdIds.add("as@gmail.com");
        stdIds.add("zx@gmail.com");
        stdIds.add("qw@gmail.com");
        stdIds.add("ty@gmail.com");
        System.out.println(stdIds);

        long t5 = System.nanoTime();

        TreeSet<String> stdIdstreeSet = new TreeSet<>(stdIds);
        System.out.println(stdIdstreeSet);//[as@gmail.com, qw@gmail.com, ty@gmail.com, xy@gmail.com, zx@gmail.com]

        System.out.println("HashSet : " + (t2 - t1));//HashSet : 462500
        System.out.println("LinkedHashSet : " + (t3 - t2));
        System.out.println("TreeSet : " + (t4 - t3));
        System.out.println("TreeSet + HashSet: " + (t5 - t4));


    }
}
