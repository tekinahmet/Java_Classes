package day10multiple_arrays_arraylists;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class C04ArrayLists {
    public static void main(String[] args) {

//        interview question
//        3.create an character list which has repeated elements then remove the duplicates

        List<Character> a = new ArrayList<>();
        a.add('J');
        a.add('a');
        a.add('v');
        a.add('a');
        a.add('v');

        List<Character> b = new ArrayList<>();
        for(Character w : a){
            if(!b.contains(w)){
                b.add(w);
            }
        }
        System.out.println(b);//[J, a, v]

//        4.find the closest 2 integers in the given list.
//          [20, 15, 14, 11, 19] ==> 14-15, 19-20
        List<Integer> num = new ArrayList<>();
        num.add(20);
        num.add(15);
        num.add(14);
        num.add(11);
        num.add(19);
        System.out.println(num);//[20, 15, 14, 11, 19]

        Collections.sort(num);
        System.out.println(num);//[11, 14, 15, 19, 20]

        int minimum = num.get(1) - num.get(0);
        for(int i=1; i<num.size(); i++){
            minimum = Math.min(minimum, num.get(i) - num.get(i-1));
        }
        System.out.println(minimum);//1
        for(int i=1; i<num.size(); i++){
            if(num.get(i) - num.get(i-1) == minimum ){
                System.out.println(num.get(i - 1) + " and " + num.get(i));//14 and 15, 19 and 20
            }
        }


    }
}
