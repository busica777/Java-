package Class16;

public class Student {
    /*
    Create a class called Students
    Create 3 variables Name, ID and the Student Class
    Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students

     */
    String name;
    String id;
    static  int numberOfStudent;

    public static void main(String[] args) {
        Student roman= new Student();
        roman.id="1";
        roman.name="Ivan";
        Student.numberOfStudent++;

        Student sonamKapor= new Student();
        sonamKapor.id="2";
        sonamKapor.name="Sonam";
        Student.numberOfStudent++;

        System.out.println(Student.numberOfStudent);
        System.out.println(Student.numberOfStudent);


    }
}

