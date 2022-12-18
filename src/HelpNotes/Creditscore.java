package HelpNotes;

import java.util.Scanner;

class Creditscore {
 public static void main(String [] args){
  Scanner scanner=new Scanner(System.in);
  System.out.println("Do you need a loan?");
   boolean money=scanner.nextBoolean();
   if(money) 
   {System.out.println("What is your credit score?");
   int points=scanner.nextInt();
   
   if (points<600)
   {System.out.println("The eligibility is Not eligible");}
   else if 
   (points>=600 && points<=700)
     {System.out.println("The eligibility is Maybe eligible");}
  else if
    (points>=701 && points<=800)
      {System.out.println("The eligibility is Eligible");}
   else if (points>800)
   {System.out.println("The eligibility is Definitely eligible");
        }}
  else {System.out.println("The eligibility is Unknown");}
   
}}