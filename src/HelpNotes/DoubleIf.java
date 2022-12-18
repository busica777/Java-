package HelpNotes;

import java.util.Scanner;

public class DoubleIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your gender: M or F");
        String gender=scan.next();
        
        System.out.println("Please enter your age");
        int age=scan.nextInt();
        
        if(age>25){
          if(gender.equals("F"))
        {System.out.println("Woman");}
            
     else{System.out.println("Man");}
          
        }
        if (age<25){
          if(gender.equals("M"))
          {System.out.println("Boy");}

          else{ System.out.println("Girl");}
        }
    }
}