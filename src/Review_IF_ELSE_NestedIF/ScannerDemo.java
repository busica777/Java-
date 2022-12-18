package Review_IF_ELSE_NestedIF;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner scan=new Scanner(System.in);

        System.out.println("Pelease Enter your age");
        int age=scan.nextInt();

        System.out.println("Pelease Enter your name");
        scan.nextLine();
        String name=scan.nextLine();


        System.out.println(name+" is "+age+" years old");

    }
		
		
		
		
	

}
