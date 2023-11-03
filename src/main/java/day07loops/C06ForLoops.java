package day07loops;

public class C06ForLoops {
    public static void main(String[] args) {

        double n = 28.587;
        String s = String.valueOf(n);
        String ds = s.split("\\.")[1];
        System.out.println(ds);//587

        int ids = Integer.valueOf(ds);
        System.out.println(ids);//587

        int sumOfDigits = 0;
        for(int i=ids; i>0; i=i/10){
            sumOfDigits=sumOfDigits+i%10;
        }
        System.out.println(sumOfDigits);//20
    }
}
