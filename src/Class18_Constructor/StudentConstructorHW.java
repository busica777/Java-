package Class18_Constructor;

public class StudentConstructorHW {
//Write a java Class Students that have a constructor which takes students name and 3 subject grades.
// Inside your class also have a method to Calculate Average Grade.
// Test Student class for 5 different students with different marks.
// Your program should print an average mark of each students name.
    String name;
    double subj1;
    double subj2;
    double subj3;

    StudentConstructorHW(String studentName,double sub1, double sub2, double sub3){
        name=studentName;
        subj1=sub1;
        subj2=sub2;
        subj3=sub3;

    }

    void avg(){
        System.out.println(name+" "+(subj1+subj2+subj3)/3);

    }

    public static void main(String[] args) {
        new StudentConstructorHW("Samsa",99,98,97.5).avg();
    }
}
