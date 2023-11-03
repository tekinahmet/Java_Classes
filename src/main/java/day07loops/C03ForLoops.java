package day07loops;
public class C03ForLoops {
    public static void main(String[] args) {
//        NESTED FOR LOOP
       /*
            Type code to print the following image on the console
            X X X X X
            X X X X X
            X X X X X
        */
        int row = 3;
        int column = 5;
        for(int i = 1; i<=row ; i++){
            String s = "";
            for(int k=1; k<=column; k++){
                s = s + "X ";
            }
            System.out.println(s);/*
                                    X X X X X
                                    X X X X X
                                    X X X X X
                                   */
        }
    }
}
