package Class22_;
//Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
//Define common behavior within parent class and override some of the methods in child classes
//Define some methods specific to child classes
//Write example of achieving run time polymorphism
public class Student {
    void study() {
        System.out.println("Student is studying");
    }

    void work() {
        System.out.println("Student is working");
    }

    void sleep() {
        System.out.println("Student is sleeping");
    }

}
    class SyntaxStudent extends Student{
        @Override
        void work() {
            super.work();
            System.out.println("Student should have some time to rest as well");
        }
        void study() {
            System.out.println("Student is studying Java");
        }
        void sleep() {
            System.out.println("Student is sleeping outside");
        }
    }
    class CollegeStudent extends Student{
        @Override
        void sleep() {
            System.out.println("Student doesn't sleep a lot of hours");
        }
        void work() {
            System.out.println("Student is working in the shop");
        }
        void study() {
            System.out.println("Student is studying Math");
        }
    }
    class SchoolStudent extends Student{
        void study(){
            System.out.println("School student is late today");
        }
        void work() {
            System.out.println("Student is working in the bar");
        }
        void sleep() {
            System.out.println("Student is sleeping at home");
        }
    }

