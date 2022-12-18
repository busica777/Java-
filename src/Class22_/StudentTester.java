package Class22_;

 public class StudentTester {
     public static void main(String[] args) {

         Student[] student1 = {new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};
         for (Student guy : student1) {
             guy.sleep();
             guy.work();
             guy.study();

         }
         System.out.println("*************************");
for (int i=0;i<student1.length;i++){
    student1[i].study();
    student1[i].work();
    student1[i].sleep();
}
     }



 }