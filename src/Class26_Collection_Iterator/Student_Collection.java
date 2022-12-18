package Class26_Collection_Iterator;

import java.util.HashSet;

public class Student_Collection {

    String name;
    int ID;

    Student_Collection(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    void Apply() {
        System.out.println(name);
    }

}
   class University extends Student_Collection {
       University(String name, int ID) {
           super(name, ID);
       }
       void Apply(){
           System.out.println("name1 "+name);
       }
   }

    class School extends Student_Collection{
    School(String name, int ID){
        super(name, ID);
    }
    void Apply(){
        System.out.println("name2 "+name);
    }

    }
    class Academy extends Student_Collection{
    Academy(String name,int ID){
        super(name, ID);
    }
        void Apply() {
            System.out.println("name3 "+ name);
        }
    }

    class Test_Student{
        public static void main(String[] args) {

            HashSet<Student_Collection>hashSet=new HashSet<>();
             hashSet.add(new University("Sandy",55));
             hashSet.add(new School("Trevor",14));
             hashSet.add(new Academy("John ",43));

            for (Student_Collection student:hashSet
                 ) {
                student.Apply();
            }

        }
    }






