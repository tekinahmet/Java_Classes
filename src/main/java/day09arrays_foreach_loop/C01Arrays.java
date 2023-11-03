package day09arrays_foreach_loop;

import java.util.Arrays;
public class C01Arrays {
    public static void main(String[] args) {
/*
        Arrays is a data structure, used to store multiple data in the same data type.
        when you create an Array, you have to declare the number of elements(lenght) in the array.
        to learn a new topic:
        1.what is it?
        2.why do we need it?
        3.how do we use it?
        4.mid-level implementation should be practice.
        5.advanced-level implementations should be applicable.
*/
        String[] str1 = new String[5];
        System.out.println(Arrays.toString(str1));//[null, null, null, null, null]

        String[] str = new String[5];
        str[0] = "Ahmet";
        str[1] = "Kübra";
        str[2] = "Nur";
        str[3] = "Nil";
        str[4] = "Tekin";
        System.out.println(Arrays.toString(str));//[Ahmet, Kübra, Nur, Nil, Tekin]

        String[] stdNames = {"Ahmet", "Kübra", "Nur", "Nil", "Tekin" };
        System.out.println(Arrays.toString(stdNames));//[Ahmet, Kubra, Nur, Nil, Tekin]

//       1. how to get a specific element from an Array
        String fourth = stdNames[3];
        System.out.println(fourth);//Nil

//        2. create an integer Array, find the multiplication of all element

        //===>Arrays
        int[] ages = {12, 5, 7, 1};
        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));//[1, 5, 7, 12]
        int sum = 1;
        for(int i = 0; i<ages.length; i++){
            sum = sum*ages[i];
        }
        System.out.println(sum);//420

        //===>for-each-loop(enhanced loop)
        /*
            for-each-loop is so easy to use, that is why if it is possible we prefer to use for-each-loop
            sometimes we need to work with indexes,if you need to use indexes, using for-each-loop is not possible
            for-each-loop can be used just with with "Arrays" and "Collections"
         */
        int result =1;
        for(int w : ages){
            result =result*w;
        }
        System.out.println(result);//420

//        3. find the difference between the maximum and minimum value of Array elements
        int[] nums = {8, 12, 34, 10, 78, 19};

        //1.way
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));//[8, 10, 12, 19, 34, 78]

        int min = nums[0];
        int max = nums[nums.length-1];
        System.out.println(max-min);//70

        //2.way
        int minimum = nums[0];
        int maximum = nums[0];

        for(int w : nums){
            maximum = Math.max(maximum,w);
            minimum = Math.min(minimum,w);
        }
        System.out.println(maximum - minimum);//70
    }
}
