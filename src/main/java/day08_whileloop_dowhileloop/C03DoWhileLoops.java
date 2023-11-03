package day08_whileloop_dowhileloop;

public class C03DoWhileLoops {
    public static void main(String[] args) {

//        while loop
        int i = 1;
        while (i<1){
            System.out.println("While loop");
            i++;
        }//zero error

//        do while loop

        do{
            System.out.println("do while loop");
        }while(i<1);//do while loop

//        2. reverse a String by using do-while-loop

        String str = "Alex";
        String reversed = "";
        int lastIndex = str.length()-1;
        do{
            reversed = reversed + str.charAt(lastIndex);
            lastIndex--;
        }while(lastIndex>=0);
        System.out.println(reversed);
        System.out.println();

//        3. type code to find the sum of the digits of a given integer
        int k3 = 7;
        int sum1 = 0;
        for(k3 = 7; k3<11; k3++){
            sum1=sum1+k3;
        }
        System.out.println(sum1);//34
        System.out.println();

        int k2 = 7;
        int sum2=0;
        while(k2<11){
            sum2=sum2+k2;
            k2++;
        }
        System.out.println(sum2);//34
        System.out.println();


        int k = 7;
        int sum = 0;
        do{
            sum = sum + k;
            k++;
        }while(k<11);
        System.out.println(sum);//34
        System.out.println();


//        4.





    }
}
