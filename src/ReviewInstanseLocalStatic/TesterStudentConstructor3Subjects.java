package ReviewInstanseLocalStatic;

public class TesterStudentConstructor3Subjects {
    public static void main(String[] args) {

        StudentConstructor3Subjects student1=new StudentConstructor3Subjects("Sam", 78.5, 90, 66.4);
        student1.averageGrade();

        StudentConstructor3Subjects student2=new StudentConstructor3Subjects("Body",45,99.1,83.2);
        student2.averageGrade();

        StudentConstructor3Subjects student3=new StudentConstructor3Subjects("Mike",78,75.5,94.7);
        student3.averageGrade();

        StudentConstructor3Subjects studen4=new StudentConstructor3Subjects("Jake",55,99.9,75);
        studen4.averageGrade();

        StudentConstructor3Subjects student5=new StudentConstructor3Subjects("Tony",88,14.9,99);
        student5.averageGrade();



    }
}
