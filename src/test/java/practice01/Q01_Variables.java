package practice01;

public class Q01_Variables {
    public static void main(String[] args) {
/*
        Task: Write a Java programme to break an integer into a sequence of individual digits.
        Hint: use / and %
        x: input: 12345
        output: 1
                      2
                      3
                      4
                      5
*/
        int x = 12345;
        int ones =x%10;
        int tens =(x/10)%10;
        int hundreds =(x/100)%10;
        int thousands =(x/1000)%10;
        int tenThousands =(x/10000)%10;

        System.out.println(tenThousands +"\n" + thousands + "\n" + hundreds+ "\n" +tens + "\n" + ones);


    }
}
