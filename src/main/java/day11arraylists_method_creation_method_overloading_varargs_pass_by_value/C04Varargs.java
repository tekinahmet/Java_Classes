package day11arraylists_method_creation_method_overloading_varargs_pass_by_value;

public class C04Varargs {
    /*
        ---Varargs (variable arguments) is a short name for variable arguments.
        ---In Java, an argument of a method can accept arbitrary number of values.
        ---This argument that can accept variable number of values is called varargs.
        ---The first is a method with a String array parameter,
        while the latter is a method with a variable-length argument list (varargs).
        ---Varargs are always placed as the last parameter in a method's parameters list,
        thus a method can declare only one varargs argument.
    */
    public static void main(String[] args) {
        System.out.println(add());//0
        System.out.println(add(5));//5
        System.out.println(add(5,3));//8
        System.out.println(add(5,3,4,8,6,9,7));//42
    }
//    create a method able to add with any numbe of parameters
    public static int add(int ...a){//int... a
        int sum =0;
        for(int w : a){
            sum = sum+w;
        }
        return sum;
    }
}
