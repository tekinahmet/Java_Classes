package day24lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class C02Lambda {
    //Print the list elements on the console with all characters in uppercase by sorting in ascending order by using length
    public static void printElementsInUppercaseInAscendingOrder(List<String> list){
        list.
                stream().
                map(t->t.toUpperCase()).
                sorted(Comparator.comparing(t->t.length())).
                forEach(t-> System.out.print(t + " "));
    }
    //Sort the elements by using their lengths, if some elements are in the same length put them in alphabetical order
    public static List<String> sortElementsWithLengthThenAlphabetical(List<String> list){
        return list.
                stream().
                sorted(Comparator.comparing(t->t.toString().length()).thenComparing(t->t.toString().charAt(0))).
                collect(Collectors.toList());
    }
    //Create a method checks if the length of all elements are greater than a given value
    public static boolean checkIfItIsGreaterThanGivenValue (List<String> list, int givenValue){
        return list.
                stream().
                allMatch(t->t.length()>givenValue);
    }
    //Create a method checks if the length of any elements are greater than a given value
    public static boolean checkIfAnyIsGreaterThanGivenValue (List<String> list, int givenValue){
        return list.
                stream().
                anyMatch(t->t.length()>givenValue);
    }
    //Create a method checks if no element starts with the given value
    public static boolean checkIfNoElementStartsWithTheGivenValue (List<String> list, String givenValue){
        return list.
                stream().
                noneMatch(t->t.substring(0,1).equals(givenValue));
    }
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Alex");
        names.add("Jim");
        names.add("Michael");
        names.add("Mary");
        names.add("Alexander");
        names.add("Alex");
        printElementsInUppercaseInAscendingOrder(names);//TOM JIM ALEX MARY ALEX MICHAEL ALEXANDER
        System.out.println();
        System.out.println(sortElementsWithLengthThenAlphabetical(names));//[Jim, Tom, Alex, Alex, Mary, Michael, Alexander]
        System.out.println(checkIfItIsGreaterThanGivenValue(names, 3));//false
        System.out.println(checkIfAnyIsGreaterThanGivenValue(names,3));//true
        System.out.println(checkIfNoElementStartsWithTheGivenValue(names, "a"));//true
    }
}
