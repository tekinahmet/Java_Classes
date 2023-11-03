package day11arraylists_method_creation_method_overloading_varargs_pass_by_value;
public class C03MethodOverlooding {
    public static void main(String[] args) {
        /*
        ---Method overloading in java is a feature that allows a class to have
         more than one method with the same name, but with different parameters.
        ---Java supports method overloading through two mechanisms:
                    -By changing the number of parameters
                    -By changing the data type of parameters
        ---You can use any access modifier in "Method Overlooding".
        ---static or non-static methods can be overlooded.
        being static or non-static does not affect method overlooding
        ---"Method names and parameters" (called method signature) are essential in Methods.
        ---OOP ===> Inheritance, Polymorphism(Method Overlooding and Method Overriding, Encapsulation, Abstraction
         */
//        create a method adds two integers
        int num1 = add(1, 2);
        System.out.println(num1);

//        create a method adds three integers
        int num2= add(4,5,6);
        System.out.println(num2);

//        create a method one integer and a double
        double num3 = add(5, 7.5);//12.5, Object
        System.out.println(num3);

//        create a method adds one double and one integer
        double num4=add(5.5,5);
        System.out.println(num4);//10.5
    }
    //Create a method adds two integers
    public static int add(int a, int b){
        return a+b;
    }
    //Create a method adds three integers
    protected static int add(int a, int b, int c){
        return a+b+c;
    }
    //Create a method adds one integer and one double
    static double add(int a, double b){
        return a+b;
    }
    //Create a method adds one double and one integer
    private static double add(double a, int b){
        return a+b;
    }
}
