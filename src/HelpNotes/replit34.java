package HelpNotes;
import java.util.Scanner;
class replit34 {
public static void main(String[] args) {
  Scanner scanner=new Scanner(System.in);
  System.out.println("Please enter 3 distinct numbers");
 
  int n1 = 4;
        int n2 =5;
        int n3 = 6;
        if (n1 > n2 && n1 > n3) {
            System.out.println("The largest number is "+n1);
        } else if (n2 > n3 && n2 > n1) {
            System.out.println("The largest number is "+n2);
        } else if (n3 > n1 && n3 > n2) {
            System.out.println("The largest number is "+n3);
        }
}
}