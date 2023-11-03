package day07loops;

public class C02ForLoops {
    public static void main(String[] args) {
//        type code to reverse a String

        String s = "My name is Ahmet";
        for(int i=s.length()-1; i>=0; i--){
            System.out.print(s.charAt(i));
        }//temhA si eman yM

        String s1 = "Alexa";
        String reversed = "";
        for(int i=s1.length()-1; i>=0; i--){
            reversed = reversed + s1.charAt(i);
        }
        System.out.println(reversed);//axelA

//          Example 5: Type code to find the sum of the digits in an integer
//           587 ==> 5+8+7 = 20

        int num = -587;
        num = Math.abs(num);
        int sumOfDigits = 0;
        for(int i=num; i>0; i=i/10){
            sumOfDigits = sumOfDigits + i%10;
        }
        System.out.println(sumOfDigits);//20

//        type code to find unique characters in a String

        String t="Hello";
        for(int i=0; i<t.length(); i++){
            if(t.indexOf(t.charAt(i))==t.lastIndexOf(t.charAt(i))){
                System.out.print(t.charAt(i));
            }
        }
    }
}
