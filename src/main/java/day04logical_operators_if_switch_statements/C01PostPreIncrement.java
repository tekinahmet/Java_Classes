package day04logical_operators_if_switch_statements;
public class C01PostPreIncrement {
    public static void main(String[] args) {

//        post-increment
        int a = 12;
        int b = a++;
        System.out.println("1st post-increment:  " +a);//13
        System.out.println("1st post-increment:  " +b);//12

        double x = 11.5;
        double y = x++;
        System.out.println("2nd post-increment: " + x);//12.5
        System.out.println("2nd post-increment: "+ y);//11.5

//        pre-increment
        int t = 10;
        int u = ++t;
        System.out.println("pre-increment: "+t);//11
        System.out.println("pre-increment: "+u);//11

//        post-decrement
        int c = 15;
        int d = c--;
        System.out.println("post-decrement: "+ c);//14
        System.out.println("post-decrement: "+ d);//15

//        pre-decrement
        int i = 20;
        int f = --i;
        System.out.println("pre-decrement: "+ i);//19
        System.out.println("pre-decrement: "+ f);//19

        int n = 5;
        int o = n++ * ++n;
        System.out.println("pre-decrement: "+ n);//
        System.out.println("pre-decrement: "+ o);//

        int m = 20;
        int l = a++;
        System.out.println("post-decrement: "+ m);
        System.out.println("post-decrement: "+ l);
    }
}
