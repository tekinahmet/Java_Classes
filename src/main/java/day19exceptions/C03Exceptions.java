package day19exceptions;
/*

Difference between "Exception" and "error"
---"Exceptions" can be handled but "errors" cannot.
Examples for errors ==> StackOverFlowError: Stack memory is full, you cannot create new objects.
                    ==> OutOfMemoryError: Heap memory is full, ypu cannot create any non-primitive data
                    ==> VirtualMachineError
Exceptions are in 2 types:
i) Runtime Exceptions: StringIndexOutOfBoundsException,  NumberFormatException etc.
ii) Compiletime Exceptions: FileNotFoundException, IOException etc.
---When you use multiple catch blocks, if there is no parent-child relationship between the Exception
classes you can put multiple catch blocks in any order. if there is parent-child relationship between the Exception
classes child must come before the parent otherwise, you will get error.

*/

public class C03Exceptions {
    public static void main(String[] args) {
        System.out.println(getCharConvertToInt("98765", 2));
        System.out.println(getCharConvertToInt("98765", 5));//StringIndexOutOfBoundsException
//      Java throws StringIndexOutOfBoundsException if you use non-existing index in a String
        System.out.println(getCharConvertToInt("My Java", 3));//NumberFormatException For input string: "J"

        System.out.println(getCharacterConvertToInt("98765", 5));//begin 5, end 6, length 5
        System.out.println(getCharacterConvertToInt("My Java", 3));//For input string: "J"

        System.out.println(getCharConvertInt("98765", 5));
        System.out.println(getCharConvertInt("My Java", 3));
    }

    //    Create a method which gets a character from a String and converts it to it.

    //    1st wat to handle multiple issues. Create catch block for every Exceptions.
    public static int getCharConvertToInt(String s, int idx) {
        int result = 0;
        try {
            String ch = s.substring(idx, idx + 1);
            result = Integer.parseInt(ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Do not use non-existing index for a String");
        } catch (NumberFormatException e) {
            System.out.println("Do not use non-digits characters in parseInt()");
        }
        return result;
    }

    //    2nd way to handle multiple issues. just use a single catch block
    public static int getCharacterConvertToInt(String s, int idx) {
        int result = 0;
        try {
            String ch = s.substring(idx, idx + 1);
            result = Integer.parseInt(ch);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return result;
    }
    //    3rd way to handle multiple issues. Use a specific implementation for a specific Exception,
//    and use Exception class for all the others.
    public static int getCharConvertInt(String s, int idx) {
        int result = 0;
        try {
            String ch = s.substring(idx, idx + 1);
            result = Integer.parseInt(ch);
        } catch(NumberFormatException e){
            System.out.println("Specific implementation for NumberFormatException");
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return result;
    }
}