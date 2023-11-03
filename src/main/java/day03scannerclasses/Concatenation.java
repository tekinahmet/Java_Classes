package day03scannerclasses;
public class Concatenation {
    public static void main(String[] args) {

        String name="Tom";
        String lastName="Hanks";

        int i=12;
        int k=5;

        char c = 'A';

        System.out.println(name + " " + lastName);//Tom Hanks
        System.out.println(name.concat(" " + lastName));//Tom Hanks

        System.out.println(name + i + k );//Tom125
        System.out.println(name + (i + k )); //Tom17
        System.out.println(name.concat(" "+ (i+k))); //Tom 17
        System.out.println(i+k+" "+name);//17 Tom
    }
}
