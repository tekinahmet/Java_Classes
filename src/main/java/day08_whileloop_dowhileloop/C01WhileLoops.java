package day08_whileloop_dowhileloop;
public class C01WhileLoops {
    public static void main(String[] args) {

//        1. type code to print even integers from 13 to 8.
        int i=13;
        while(i>7){
            if(i%2==0){
                System.out.print(i + " ");
            } i--;
        }//12 10 8
        System.out.println();

//        2. type code to check if a given integer is polindrome or not
        int k = -123321;
        k = Math.abs(k);
        String k1 = String.valueOf(k);
        int k2 = k1.length()-1;
        String reversed = "";

        while(k2>=0){
            reversed = reversed + k1.charAt(k2);
            k2--;
        }
        System.out.print(reversed);//1221
        System.out.println();

        if(k1.equals(reversed)){
            System.out.print("palindrome");
        }else{
            System.out.print("not palindrome");
        }//palindrome
    }
}
