package HelpNotes;
/*Create Class EncapsulationDemo
create two variable as shown below.
private String empName=John;
private int empAge=30;
Create only getters methods for each variable.
Print the values of each variable as shown below.
**Expected Output:**
FromClass16.RewievClasses.src.Class21.Employee Name: John
FromClass16.RewievClasses.src.Class21.Employee Age: 30
* */
public class Repl180_Encapsulation_NoGet {
    private String empName= "John";
    private int empAge=30;

    public String getempName(){
        return empName;
    }
    public int getempAge(){
        return empAge;
    }}
class Test1 {
    public static void main(String[]aaaa){
        Repl180_Encapsulation_NoGet obj=new Repl180_Encapsulation_NoGet();

        System.out.println("FromClass16.RewievClasses.src.Class21.Employee Name: "+obj.getempName());
        System.out.println("FromClass16.RewievClasses.src.Class21.Employee Age: "+obj.getempAge());
    }
}

