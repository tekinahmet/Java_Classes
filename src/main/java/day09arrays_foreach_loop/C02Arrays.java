package day09arrays_foreach_loop;
import java.util.Arrays;
public class C02Arrays {
    public static void main(String[] args) {
//        1.create a String Array, add 5 elements in it, find the sum of the numbers of them
        String[] cities = {"Kütahya", "Eskişehir", "Kayseri", "Ankara", "Antalya"};

        int sum=0;
        for(String w : cities){
            sum = sum + w.length();
        }
        System.out.println(sum);//36

        // note 1: Arrays can contain just "primitive data types" and "references" of the non-primitives.
        // note 2: String use "lenght()" but Arrays use "lenght variable"

//        2. [0, 2, 3, 0, 12, 0] ===>[2, 3, 12, 0, 0, 0]

        int[] m = {0, 2, 3, 0, 12, 0};
        int[] n = new int[m.length];
        System.out.println(Arrays.toString(n));//[0, 0, 0, 0, 0, 0]

        int idx = 0;
        for(int w: m){
            if(w!=0){
                n[idx] = w;
                idx++;
            }
        }
        System.out.println(Arrays.toString(n));//[2, 3, 12, 0, 0, 0]
    }
}
