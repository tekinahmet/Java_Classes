package day11arraylists_method_creation_method_overloading_varargs_pass_by_value;
public class C05PassByValuePassByReference {
    /*
    ---Pass by value: The method parameter values are copied to another variable and
    then the copied object is passed to the method. The method uses the copy.
    ---Pass by reference: An alias or reference to the actual parameter is passed to the method.
     */
    public static void main(String[] args) {
        int n = 5;
        int m = 7;
        int sum = add(n, m);
        System.out.println(sum);//12

    }
    public static int add(int... a){
        int sum =0;
        for(int w : a){
            sum=sum+w;
        }
        return sum;
    }
}
