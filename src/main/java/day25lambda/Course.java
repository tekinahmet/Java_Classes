package day25lambda;

public class Course {
    /*
    1. private variables
    2. constructors with parameters
    3. constructors without parameters
    4. Getters
    5. Setters
    6. toString() method
        Any class that's got above 6 features is called "POJO" class ==> "Plain Old Java Object"
     */
    private String courseName;
    private int numOfStd;
    private String season;
    private double avgScore;

    public Course(String courseName, int numOfStd, String season, double avgScore){
        this.courseName=courseName;
        this.numOfStd=numOfStd;
        this.avgScore=avgScore;
        this.season=season;
    }
    public Course(){

    }
    public String getCourseName() {
        return courseName;
    }
    public int getNumOfStd() {
        return numOfStd;
    }
    public String getSeason() {
        return season;
    }
    public double getAvgScore() {
        return avgScore;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public void setNumOfStd(int numOfStd) {
        this.numOfStd = numOfStd;
    }
    public void setSeason(String season) {
        this.season = season;
    }
    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }
    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", numOfStd=" + numOfStd +
                ", season='" + season + '\'' +
                ", avgScore=" + avgScore +
                '}';
    }
}
