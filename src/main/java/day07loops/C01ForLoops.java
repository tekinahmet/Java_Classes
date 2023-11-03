package day07loops;
public class C01ForLoops {
    public static void main(String[] args) {

//        type code to print even integers from 5 to 16 on the console

        for(int i=5; i<17; i++){
            if(i%2==0){
                System.out.println(i + " ");//6 8 10 12 14 15
            }
        }

//        type code to print odd integers from 15 to 6 on the console
        for(int i=15; i>5; i--){
            if(i%2!=0){
                System.out.println(i + " ");
            }
        }//15 13 11 9 7

//        type code to print odd integers from 5 to 16 except 7 on the

        for(int i = 5; i<17; i++){
            if(i!=7) {
                System.out.println(i + " ");
            }//5 6 8 9 10 11 12 13 14 15 16
        }

//        continue; is used to skip some values in a loop.
//        continue; takes yo to increment/decrement part in a loop.
        for(int i=5; i<17; i++){
            if(i==7){
                continue;
            }
            System.out.println(i + " ");
        }//5 6 8 9 10 11 12 13 14 15 16

//        print String characters one by one on the console.
//        if you see "x" stop printing

        String str = "I like extra effort";
        for (int i = 0; i<str.length();i++ ){
            if(str.charAt(i)=='x'){
                break;
            }System.out.print(str.charAt(i));//I like e
        }



















    }
}
