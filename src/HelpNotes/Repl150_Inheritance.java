package HelpNotes;

public class Repl150_Inheritance {


        String name;
        String lastName;
        int age;


    Repl150_Inheritance(String name, String lastName,int age){
            this.name=name;
            this.lastName=lastName;
            this.age=age;

        }
    }
    class Employee extends Repl150_Inheritance{
        int salary;

        Employee(String name,String lastName,int age,int salary){
            super(name,lastName,age);
            this.salary=salary;
        }
        void print( ){
            System.out.println(name+" "+lastName+" "+age+" "+salary);
        }
    }

    class Student extends Repl150_Inheritance{
        int grade;

        Student(String name,String lastName,int age, int grade){
            super(name, lastName,age);
            this.grade=grade;
        }
        void print(){
            System.out.println(name+" "+lastName+" "+age+" "+grade);
        }
    }

    class Retiree extends Repl150_Inheritance{
        String seniorActivity;

        Retiree(String name,String lastName,int age,String seniorActivity){
            super(name, lastName,age);

            this.seniorActivity=seniorActivity;
        }
        void print(){
            System.out.println(name+" "+lastName+" "+age+" "+seniorActivity);
        }
    }
    class Output{
        public static void main(String[]args){
            Employee first=new Employee("Joe","Smith",35,35000);
            first.print();

            Student second=new Student("Adam","Smith",15,10);
            second.print();

            Retiree third=new Retiree("Frank","Smith",15,"tour");
            third.print();
        }}

