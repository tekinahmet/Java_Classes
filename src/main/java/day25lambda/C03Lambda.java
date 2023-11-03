package day25lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class C03Lambda {
    public static void main(String[] args) throws IOException {
        //How to access a file
        Files.
                lines(Paths.get("src/main/java/day25lambda/myTextFile.txt")).
                forEach(System.out::println);
        System.out.println("------------");
        //Convert all characters to uppercase and sort the lines in natural order
        Files.
                lines(Paths.get("src/main/java/day25lambda/myTextFile.txt")).
                map(String::toUpperCase).
                sorted().
                forEach(System.out::println);
        System.out.println("------------");
        //Print the lines that contain the word "Java"
        Files.
                lines(Paths.get("src/main/java/day25lambda/myTextFile.txt")).
                filter(t->t.contains("Java")).
                forEach(System.out::println);
        System.out.println("------------");
        //Print the distinct words in the text file
        Files.
                lines(Paths.get("src/main/java/day25lambda/myTextFile.txt")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).
                map(t-> t.replaceAll("\\p{Punct}", "")).
                distinct().
                forEach(System.out::println);
        System.out.println("------------");
        //Find the total number of letters used in the text
        int numOfChar = Files.
                lines(Paths.get("src/main/java/day25lambda/myTextFile.txt")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).
                map(t->t.replaceAll("[^a-zA-Z]", "")).
                map(t->t.length()).
                reduce(Math::addExact).get();
        System.out.println(numOfChar);//177
    }
}
