package day02_datatypes;

public class C03WrapperClasses {
    public static void main(String[] args) {

        Integer age = 38;
        System.out.println(age.toString());//38
        System.out.println(Integer.MIN_VALUE);//-2147483648
        System.out.println(Integer.MAX_VALUE);//2147483647
        System.out.println(Short.MIN_VALUE);//-32768
        System.out.println(Short.MAX_VALUE);//32767

//      Autoboxing primitive to wrapper
        char ch = '?';
        Character chWrapper = ch;
        System.out.println(chWrapper);//?

//      Unboxing wrapper to primitive
        Boolean b1 = true;
        boolean b2 = b1;
        System.out.println(b2);//true
    }
}
