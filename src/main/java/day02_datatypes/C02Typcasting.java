package day02_datatypes;

public class C02Typcasting {
    public static void main(String[] args) {
//        widening
//        byte -> short -> char -> int -> long -> float -> double
        byte myAge = 38;
        int age = myAge;//38

        System.out.println(age);

//        narrowing
//        double -> float -> long -> int -> char -> short -> byte
        long value1 = 3400l;
        short value2 = (short) value1;

        System.out.println(value2);//3400

        int numOfStd = 12;
        int amountOfMoney = 500;//41
        float amountOfMoney1 = 500f;//41.666668
        double amountOfMoney2 = 500;//41.666666666666664

        System.out.println(amountOfMoney1/numOfStd);
    }
}
