package Class16;

public class GradeIfElseReturn {
    /*
    Create  class Student that will have a method getGrade. Your method should accept the score of a student and return a grade:
score > 90 - A
score >80 - B
score >70 - C
score > 50 - D
anything else - F
     */
    char getGrade(int score) {
        char grade;
        if (score > 90) {
            grade = 'A';
        } else if (score > 80) {
            grade = 'B';
        } else if (score > 70) {
            grade = 'C';
        } else if (score > 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;
    }

    public static void main(String[] args) {
        GradeIfElseReturn task7=new GradeIfElseReturn();
        System.out.println( task7.getGrade(81));

    }
}

