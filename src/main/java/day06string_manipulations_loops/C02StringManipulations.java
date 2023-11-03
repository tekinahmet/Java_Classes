package day06string_manipulations_loops;

public class C02StringManipulations {
    public static void main(String[] args) {
        String s = "Hello";

        int indexOfH = s.indexOf("H");
        System.out.println(indexOfH);//0
        int lastIndexOfH = s.lastIndexOf("H");
        System.out.println(lastIndexOfH);//0
        if (indexOfH == lastIndexOfH) {
            System.out.println("H");
        }

        int indexOfE = s.indexOf("e");
        System.out.println(indexOfE);//1
        int lastIndexOfE = s.lastIndexOf("e");
        System.out.println(lastIndexOfE);//1
        if (indexOfE == lastIndexOfE) {
            System.out.println("e");
        }

        int indexOfL = s.indexOf("l");
        System.out.println(indexOfL);//2
        int lastIndexOfL = s.lastIndexOf("l");
        System.out.println(lastIndexOfL);//3
        if (indexOfL == lastIndexOfL) {
            System.out.println("l");
        }

        int indexOfO = s.indexOf("o");
        System.out.println(indexOfO);//4
        int lastIndexOfO = s.lastIndexOf("o");
        System.out.println(lastIndexOfO);//4
        if (indexOfO == lastIndexOfO) {
            System.out.println("o");
        }

        if (indexOfH == lastIndexOfH) {
            System.out.print("H");
        }
        if (indexOfE == lastIndexOfE) {
            System.out.print("e");
        }
        if (indexOfL == lastIndexOfL) {
            System.out.print("l");
        }
        if (indexOfO == lastIndexOfO) {
            System.out.print("o");
        }
    }
}
