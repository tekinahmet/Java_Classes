package day20exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/*
    1. FileNotFoundException: Java throws FileNotFoundException when the address of the file is wrong
or the is deleted.
    2. IOException: Java throws IOException for all issues related to input or output of the files.
    3. IOException is the parent exception class for FileNotFoundException.
    4. IOException and FileNotFoundException are the "Compile Time Exceptions" because
it throws exception while we are compiling it.(before clicking on the run button)
    5. We need to perform some actions that are a must for the system(e.g. cut the connection from DB)
under every condition for that purpose we use "finally block".
    6. "try block" cannot be used alone.
    7. "try block" can be used as: "try block + single catch", "try block + multiple catch",
"try block + single catch + finally block", "try block + multiple catch + finally block",
"try block + finally block".
 */

public class C01Exceptions {
    public static void main(String[] args) {
        readTheTextFromFile();
    }

//        create a method to read the text from a file.
    public static void readTheTextFromFile() {
        try {
            FileInputStream fis = new FileInputStream("src/main/java/day20exceptions/MyFile.txt");
//         to read the file
            int k=0;
            while ((k=fis.read()) != -1){
                System.out.print((char)k);// without ln
            }

        } catch (FileNotFoundException e) {
            System.out.println("The path is wrong or the file is deleted");
        } catch (IOException e) {
            System.out.println("The text of the file could not be read");
        } finally{
            System.out.println("\nCut the connection from DB");
        }
    }
}
