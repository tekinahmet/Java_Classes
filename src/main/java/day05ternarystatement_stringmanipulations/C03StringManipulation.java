package day05ternarystatement_stringmanipulations;

public class C03StringManipulation {
    public static void main(String[] args) {


//Example 1: Count the alphabetical characters in a given String
//Tom12 Hanks!... ==> 8

//i)Remove non-alphabetical characters ii)Count the remaining characters

//non-alphabetical characters are a group of data.
//To work with a group of data we use "Regular Expressions"(Regex)
/*
            i)Uppercase letters: [A-Z]
            ii)Lower case letters: [a-z]
            iii)All letters: [A-Za-z]
            iv)All digits: [0-9]
            v)Letters from m to v: [m-v]
            vi)Regex for a, b, e, d, g, z: [abedgz]

            a)All characters different from uppercase letters: [^A-Z]
            b)All characters different from lowercase letters: [^a-z]
            c)All characters different from all letters: [^A-Za-z]
            d)All characters different from digits: [^0-9]
            e)All symbols(Different from letters and digits):[^A-Za-z0-9]

            f)All punctuation marks:\\p{Punct}
*/
        String h = "Ahmet Tekin!...";
        int numOfChar = h.replaceAll("[^A-Za-z]" , "").length();
        System.out.println(numOfChar);

//replaceAll() ==> It changes a group of characters to another character
//length() ==> Counts the number of characters in String

//Example 2: Type code to change all digits to "*" in a given password
//           pwd: a12b32c! ==> a**b**c!
        String pwd = "a12b32c!";
        String hidden = pwd.replaceAll("[0-9]", "*");
        System.out.println(hidden);//a**b**c!

//Example 3: Get initials from a full name. (Middle name is out of scope)
//           Tom Hanks ==> TH   -  tom hanks ==> TH  -  "   tOM Hanks   " ==> TH
        String name = "ahmet tekin";
        System.out.println(name);//ahmet tekin

        String firstInitial = name.trim().substring(0, 1).toUpperCase();
        System.out.println(firstInitial);//A

        String lastInitial = name.trim().split(" ")[1].substring(0, 1).toUpperCase();
        System.out.println(lastInitial);//T

        System.out.println(firstInitial + lastInitial);//AT
//.trim(): Removes spaces from the beginning and from the end

//.substring(s, e): It gets a part of String.
//                 "s" stands for starting index which is inclusive
//                 "e" stands for ending index which is exclusive

//.toUpperCase(): Changes all alphabetical characters to upper cases in a String

//.split(): Splits a String from given character and indexes every part
    }
}
