package day04logical_operators_if_switch_statements;

public class C02LogicalOperators {
    public static void main(String[] args) {

//        && (AND) Operators

        int i = 10;
        int k = 5;
        System.out.println((i>k) && (i==2*k) && (i/k==2) && (i%k==0));//true
        System.out.println((i<k) && (i==2*k) && (i/k==2) && (i%k==0));//false
        System.out.println((i<k) & (i==2*k) & (i/k==2) & (i%k==0));//false

//        || (OR) Logical Operator

        int a = 6;
        int b = 2;
        System.out.println((a>b) || (a%b!=0) || (a<=3*b));//true
        System.out.println((a==b) || (a%b!=0) || (a>3*b));//false

//        || and &&

        System.out.println((a>b) || ((a%b!=0) && (a<=3*b)));//true
        System.out.println(((a>b) || (a%b!=0)) && (a<=3*b));//true

    }
}
