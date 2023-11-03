package practice02;
import java.util.ArrayList;
import java.util.Scanner;
public class Q04_ArrayList_GradeAverage {
    public static void main(String[] args) {

//Get as many grades as a teacher wants to enter and find the number of students pass the average
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> examGradeslist = new ArrayList<>();

        do{
            System.out.println("Enter the grade");
            int grade = scan.nextInt();
            examGradeslist.add(grade);

            System.out.println("examGradeslist = " + examGradeslist);

            System.out.println("Continue: Y/N");
            String condition = scan.next();

            if(condition.equalsIgnoreCase("n")){
                break;
            }

        }while(true);//Infinite loop

//      calsulate the average
        double sum = 0;
        for(int w: examGradeslist){
            sum+=w;
        }
        double average = sum/ examGradeslist.size();
        System.out.println("average = " + average );

//        calculate number of students above average
        int numOfStdAboveAvg=0;
        for(int w : examGradeslist){
            if(w>average){
                numOfStdAboveAvg++;
            }
        }
        System.out.println("numOfStdAboveAvg = " + numOfStdAboveAvg);
    }
}
