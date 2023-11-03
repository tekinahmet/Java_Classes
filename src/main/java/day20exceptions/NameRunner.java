package day20exceptions;

import java.util.ArrayList;
import java.util.List;

public class NameRunner {
    public static void main(String[] args) throws IllegalNameException {
        System.out.println(addNames("Mary"));
        System.out.println(addNames("mary"));
    }

//    Create a method to add names in to a list
    public static List<String> addNames(String name) throws IllegalNameException {
        List<String> nameList = new ArrayList<>();
        if(name.charAt(0)>65 && name.charAt(0)<91){
            nameList.add(name);
        }else {
            throw new IllegalNameException("Name should start with uppercase letter");
        }
        return nameList;
    }
}
