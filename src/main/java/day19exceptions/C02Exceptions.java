package day19exceptions;
public class C02Exceptions {
    public static void main(String[] args) {
        String[] s = {"Adam", "Mary", "Joe", "Mark"};
        getElementFromArrayByIndex(s, 1);
        getElementFromArrayByIndex(s, 4);//Exception
//        ArrayIndexOutOfBoundsException: Java throws this exception ,if you use non-existing index

        System.out.println(convertStringToInt("123") + 1);//124
        System.out.println(convertStringToInt("0") + 1);//1
        System.out.println(convertStringToInt("-2") + 1);//-1
        System.out.println(convertStringToInt("1a2") + 1);//Exception
//        NumberFormatException:
    }

    //    Create a method return the element by using index from an Array
    public static void getElementFromArrayByIndex(String[] s, int idx) {
        try {
            System.out.println(s[idx]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(-1);
        }
    }

    //    Create a method to convert a String to an Integer
    public static Integer convertStringToInt(String s) {
        Integer result = 0;

        try {
            return Integer.valueOf(s);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());//For input string: "1a2"
            System.out.println("The String is not in number format");
        }
        return result;
    }
}

