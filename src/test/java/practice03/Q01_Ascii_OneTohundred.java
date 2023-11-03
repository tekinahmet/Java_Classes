package practice03;
public class Q01_Ascii_OneTohundred {
/*
    Print on the console numbers from 1 to 100.
     But do not use any number in your code
*/
    public static void main(String[] args) {
//        System.out.println((int) + 'a');//97
//        System.out.println('a'+0);//97
//        System.out.println('d' / 'd' + " , " +(int) 'd');//1

        /* to get 0, 'd'-'d'
            to get 1, 'd'/'d'
         */

        for (int i = 'd'/'d'; i <=(int) 'd' ; i++) {
            System.out.print(i + " ");
        }
    }
}
