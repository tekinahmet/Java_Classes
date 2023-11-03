package day21collections;

import java.util.LinkedList;

public class C02linkedList {
    public static void main(String[] args) {

        LinkedList<String> countries = new LinkedList<>();
        countries.add("France");
        countries.add("Italy");
        countries.add("Turkey");
        countries.add("Germany");
        countries.add("United Kingdom");
        System.out.println(countries);

//        peek() and element() method returns the first element without removing
//        peek() method returns null when run with empty list
//        element() method throws NoSuchElementException when run with empty list

        String firstCountry = countries.peek();//Retrieves, but does not remove, the head (first element) of this list.
        System.out.println(firstCountry);//France
        System.out.println(countries);//[France, Italy, Turkey, Germany, United Kingdom]

        String country01 = countries.element();//Retrieves, but does not remove, the head (first element) of this list.
        System.out.println(country01);//France
        System.out.println(countries);//[France, Italy, Turkey, Germany, United Kingdom]

        LinkedList<String> names = new LinkedList<>();
        System.out.println(names.peek());//null
//        System.out.println(names.element());//NoSuchElementException

//        pop() amd poll() method retrieve the first element from the list and remove it.
//        pop() method throws NoSuchElementException when run with empty list.
//        poll() method returns null when run with empty list.

        String s = countries.pop();//this method is equivalent to removeFirst()
        System.out.println(s);//France
        System.out.println(countries);//[Italy, Turkey, Germany, United Kingdom]

        String n = countries.poll();//retrieves and removes the head of this list
        System.out.println(n);//Italy
        System.out.println(countries);//[Turkey, Germany, United Kingdom]

//        System.out.println(names.pop());//NoSuchElementException
        System.out.println(names.poll());//null


    }
}
