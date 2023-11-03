package day07loops;
public class C7WhileLoops {
    public static void main(String[] args) {
//        type code to print integers from 5 to 7

        for(int i=4; i<8; i++){
            System.out.print(i + " ");//4 5 6 7
        }

        System.out.println();

        int i=4;
        while(i<8){
            System.out.print(i + " ");//4 5 6 7
            i++;
        }
    }
}
