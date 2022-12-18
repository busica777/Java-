package ReviewInstanseLocalStatic;

public class ConstructorTeacherSample {

    String name, lastname;
    int experience;
    String subject;
    double salary;

    static String school;
//how to create a constructor
    //1. constructor name=classname
   // 2. no return type not even void
    //Creating constructor below we initialize  instance variables(name, lastname)
    ConstructorTeacherSample(String fname, String lname){
      name=fname;
      lastname=lname;
    }
    //when you create  a constructor
    //Compiler going to create a default constructor for us
void print(){
    System.out.println(name+" "+lastname);
}
}
