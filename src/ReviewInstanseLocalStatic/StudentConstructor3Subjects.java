package ReviewInstanseLocalStatic;

public class StudentConstructor3Subjects {
//Write a java Class Students that have a constructor which takes students name and 3 subject grades.
// Inside your class also have a method to Calculate Average Grade.
// Test Student class for 5 different students with different marks.
// Your program should print an average mark of each students name.
//NOTE: please use different names for instance and local variables.
    String name;
     double grade1;
     double grade2;
     double grade3;

     public StudentConstructor3Subjects(String studentname, double english, double java, double phyton) {

         name = studentname;
         grade1 = english;
         grade2 = java;
         grade3 = phyton;
     }
public void averageGrade(){
     double avg=(grade1+grade2+grade3)/3;

             System.out.println(name +"'s average grade is "+avg);
         }

     }



