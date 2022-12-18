package HelpNotes;
/*Create Class EncapsulationDemo that will have 2 variables empName and empAge;
Create the getter/setter methods for each variable.
In Main Class and main method
Using setter methods assign the values as "Mario" and "32"
Using getter methods print the values as below outputs.
 **Expected Output:**
FromClass16.RewievClasses.src.Class21.Employee Name: Mario
FromClass16.RewievClasses.src.Class21.Employee Age: 32*/
public class Repl179_Encapsulation {

    private String empName ;
    private int empAge;

    public String getempName(){
        return empName;}

    public void setempName(String empName){
        this.empName=empName;
    }


    public int getempAge(){
        return empAge;}

    public void setempAge(int empAge){
        this.empAge=empAge;
    }
}

class Test {
    public static void main(String[] args) {
        Repl179_Encapsulation obj = new Repl179_Encapsulation();

        obj.setempName("Mario");
        obj.setempAge(32);

        System.out.println("FromClass16.RewievClasses.src.Class21.Employee Name: " + obj.getempName());
        System.out.println("FromClass16.RewievClasses.src.Class21.Employee Age: " + obj.getempAge());
    }
}