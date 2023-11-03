package day10multiple_arrays_arraylists;
import java.lang.reflect.Array;
import java.util.Arrays;
public class C02MultidimensionalArrays {
    public static void main(String[] args) {
        int[][] a = new int[3][2];

//        how to print multidimensional arrays
        System.out.println(Arrays.deepToString(a));//[[0, 0], [0, 0], [0, 0]]

//        how to add elements
        a[0][0] = 2;
        a[0][1] = 3;
        a[1][0] = 5;
        a[1][1] = 2;
        a[2][0] = 7;
        a[2][1] = 9;
        System.out.println(Arrays.deepToString(a));//[[2, 3], [5, 2], [7, 9]]

//        1.type code to find the total number of elements in a multidimensional array

        String[][] b = { {"X", "U"}, {"a", "d", "m"}, {"T"}};

        int sum = 0;
        for(String[] w : b){
           sum = sum + w.length;
        }
        System.out.println(sum);//6

//        2. print the elements which has 'a' in it from a multidimensional array,
        String[][] c = {{"Java", "is"}, {"easy"}, {"to", "learn" }};
        for(String[] w:c){
            for(String u:w){
                if(u.contains("a")){
                    System.out.print(u + " ");//Java easy learn
                }
            }
        }
        System.out.println();
//        3.type code to find the maximum and minimum elements in a two dimensional integer array
        int[][] n = {{5, 2}, {14, 9}, {-7}};
        int maximum = n[0][0];
        int minimum = n[0][0];
        for(int[] w : n) {
            for(int u : w){
                maximum = Math.max(u, maximum);
                minimum = Math.min(u, minimum);
            }
        }
        System.out.println(maximum);//14
        System.out.println(minimum);//-7

//        4.type code to convert a multidimensional array to a one-dimensional array
        int[][] p = {{5, 2}, {14, 9}, {-7}};
        int ln = 0;
        for(int[] w : p){
           ln = ln + w.length;
        }

        int[] r = new int[ln];
        System.out.println(Arrays.toString(r));//[0, 0, 0, 0, 0]

        int idx = 0;
        for(int[] w : p){
            for(int u : w){
                r[idx] = u;
                idx++;
            }
        }Arrays.sort(r);
        System.out.println(Arrays.toString(r));//[-7, 2, 5, 9, 14]
    }
}