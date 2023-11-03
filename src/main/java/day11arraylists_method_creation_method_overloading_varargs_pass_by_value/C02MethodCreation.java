package day11arraylists_method_creation_method_overloading_varargs_pass_by_value;
public class C02MethodCreation {
    public static void main(String[] args) {

        //Method Call
        int r1 = add(3, 5);//Non-static method 'add(int, int)' cannot be referenced from a static context
        System.out.println(r1);//8

        double r2 = multiplyThreeNumbers(1.2, 4, 5.31);
        System.out.println(r2);//25.487999999999996

        String r3 = joinTwoStrings("Ahmet"+" ", "Tekin");
        System.out.println(r3 + " ");
    }
    public static int add(int a, int b){
        return a+b;
    }
    public static double multiplyThreeNumbers(double a, double b, double c){
        return a*b*c;
    }
    public static String joinTwoStrings(String a, String b){
        return  a.concat(b);
    }
//      Note: Variables used in "method creation" are called "Parameters"
//      Actual values used in method call are called "Arguments"
}
