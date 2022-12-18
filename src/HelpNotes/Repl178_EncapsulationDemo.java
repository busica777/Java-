package HelpNotes;

 class Repl178_EncapsulationDemo {
/*
Create Class EncapsulationDemo
create two variable as shown below.
private String empName;
private int empAge;
Create the getter/setter methods for each variable.
In Main Class and main method.
Using setter methods assign the values as "John" and "30"
Using getter methods print the values as below outputs.
**Expected Output:**
FromClass16.RewievClasses.src.Class21.Employee Name: John
FromClass16.RewievClasses.src.Class21.Employee Age: 30
 */
        private String empName;
        private int empAge;

        public String getempName(){return empName; }

        public void setempName(String eN){
            this.empName=eN;
        }

        public int getempAge(){return empAge;}

        public void setempAge(int eA){
            this.empAge=eA;
        }
    }

