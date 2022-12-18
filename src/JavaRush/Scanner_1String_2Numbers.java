package JavaRush;
/*TASK2: Use the keyboard to separately enter the name, number1, and number2. Display the following phrase:
"name" will receive "number1" in "number2" years.

Expected output:
Nick will receive 10000 in 5 years.*/
import java.util.Scanner;

public class Scanner_1String_2Numbers {


        public static void main(String[] args) throws Exception {
            Scanner sc=new Scanner(System.in);
            String name=sc.nextLine();
            int number1=sc.nextInt();
            int number2=sc.nextInt();

            System.out.println(name+" will receive "+number1+" in "+number2+" years.");

        }
    }