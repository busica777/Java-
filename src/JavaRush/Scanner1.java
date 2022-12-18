package JavaRush;
/*TASK 1:Enter a name and number from the keyboard, and then display the line: "name" will take over the world in "number" years. Mwa-ha-ha!

Expected output:
Kevin will take over the world in 8 years. Mwa-ha-ha! */
import java.util.Scanner;

public class Scanner1 {
/*
How to take over the world
*/
        public static void main(String[] args) throws Exception {
            Scanner sc=new Scanner(System.in);

            String name =sc.nextLine();

            int num=sc.nextInt();

            System.out.println(name+" will take over the world in "+num+" years. Mwa-ha-ha!");

        }
    }
