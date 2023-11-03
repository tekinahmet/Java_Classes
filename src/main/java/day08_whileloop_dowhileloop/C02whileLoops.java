package day08_whileloop_dowhileloop;

public class C02whileLoops {
    public static void main(String[] args) {

//        1. type code to find the sum of the digits of a given number.

        int i = -587;
        i= Math.abs(i);
        int sum = 0;
        while (i>0) {
            sum = sum + i%10;
            i/=10;
        }
        System.out.println(sum);//20
        System.out.println();

//        2. type code to create multiplication table for the given integer

        int q = 1;
        int w = 3;
        while(q<11){
            System.out.print(w + "x" + q + "=" + (w*q) + " ");
            q++;
        }//3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30
        System.out.println();















    }
}
