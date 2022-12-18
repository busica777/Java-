package HelpNotes;

public class Repl146_2Constructors_1empty {
    String name;
    String lastName;
    int employeeId;
    String startDate;
    int salary;

    public Repl146_2Constructors_1empty(){

    }
    public Repl146_2Constructors_1empty(String name, String lastName,int employeeId, String startDate, int salary){
        this.name=name;
        this.lastName=lastName;
        this.employeeId=employeeId;
        this.startDate=startDate;
        this.salary=salary;
    }
    public void print(){
        System.out.println(name+" "+lastName +" "+ employeeId+" "+startDate+" "+salary);
    }
}

