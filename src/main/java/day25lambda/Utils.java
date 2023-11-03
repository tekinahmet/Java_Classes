package day25lambda;

public class Utils {
    public static int getSumOfDigits(int n){
        int sum = 0;
        while(n!=0){
            sum = sum + n%10;
            n = n/10;
        }
        return sum;
    }
    public static boolean isEven(int n){
    return n%2==0;
    }
}
