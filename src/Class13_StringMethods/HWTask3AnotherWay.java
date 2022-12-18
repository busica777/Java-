package Class13_StringMethods;

import java.util.Scanner;

public class HWTask3AnotherWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
        System.out.println("Mom's First Name");
        String mom=input.next();
        System.out.println("Dad's First Name");
        String dad=input.next();

        System.out.println("Boy or Girl");
        String baby=input.next();
        if(baby.toLowerCase().equals("boy"))
        {
            System.out.println(dad.substring(0,3) + mom.substring(2,4));

        } else {
            System.out.println(mom.substring(0,2)+dad.substring(3,6));
        }
}}
