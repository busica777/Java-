package HelpNotes;
/*
Create Class Account
Create the below variables:
- acc_no;
- name;
- email;
- double amount;
Create the getter/setter methods for each variable.
In Main Class and the main method.
Using setter methods assign the values as:
acc_no = 7560504000
name = Sumair
email = sumair@syntax.com
amount = 50000.0
Using getter methods print the values as below output.
**Expected Output:**
7560504000 Sumair sumair@syntax.com 50000.0*/
public class Repl181_Encapsulation_big {

        private String acc_no;
        private String name;
        private String email;
        private double amount;


        public String getacc_no(){
            return acc_no;
        }
        public void setacc_no(String acc_no){
            this.acc_no=acc_no;
        }

        public String getname(){
            return name;
        }
        public void setname(String name){
            this.name=name;
        }

        public String getemail(){
            return email;
        }
        public void setemail(String email){
            this.email=email;
        }

        public double getamount(){
            return amount;
        }
        public void setamount(double amount){
            this.amount=amount;
        }
    }
class Main11 {
    public static void main(String[]aaaa){
        Repl181_Encapsulation_big obj=new Repl181_Encapsulation_big();

        obj.setacc_no("7560504000");
        obj.setname(" Sumair");
        obj.setemail(" sumair@syntax.com ");
        obj.setamount(50000.0);

        System.out.println(obj.getacc_no()+obj.getname()+obj.getemail()+obj.getamount());
    }

}