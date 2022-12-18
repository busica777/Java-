package Class03_IF_Else;
/*//1. Write a variable. If  variable equals "Monday" ,
 then i go  to work,
   // if variable equals  "Wednesday" , then I go to  gym,
   if any other day i am relaxing.*/
public class IF_Else_3days {
    public static void main(String[] args) {
        String day = "Sunday";
        if (day == "Monday") {
            System.out.println("Going to work");
        } else if (day == "Wednsday") {
            System.out.println("Today is training"); }
     else  {
        System.out.println("Today is day off");
    }
}
  }