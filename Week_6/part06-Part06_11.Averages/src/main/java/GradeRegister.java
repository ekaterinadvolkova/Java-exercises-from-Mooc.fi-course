
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> exam;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.exam = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.exam.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public double averageOfGrades(){
        double sum = 0;
        double average = 0;
        int num =1;
        if(grades.size() ==0){
            return -1;
        } else {
            for( int i=0; i< grades.size(); i++){
                sum = sum + grades.get(i);
                average = sum / num;
                num++;

            }
        }
        return average;

    }

    public double averageOfPoints(){
        double summa = 0;
        double average = 0;
        int num =1;
        if(exam.size() ==0){
            return -1;
        } else {
            for( int i=0; i< exam.size(); i++){
                summa = summa + exam.get(i);
                average = summa / num;
                num++;

            }
        }
        return average;
    }




}
