package Class23_Abstract;

public class StudentHW {
    void study(){
        System.out.println("students must study");
    }
    void doHomeWork(){
        System.out.println("Students must solve their homeworks");
    }
    void doPractice(){
        System.out.println("Students must practice to get good marks");
    }
}
class SyntaxStudentHW extends StudentHW{
    @Override
    void doHomeWork(){
        System.out.println("Syntax students must solve Repls three times");
    }
    void doPractice(){
        System.out.println("Syntax students must do their own research and practice");
    }
}
class CollegeStudentHW extends StudentHW{

    @Override
    void doPractice(){
        System.out.println("College students must practice to get good marks");
    }
}
class SchoolStudentHW extends StudentHW{

}