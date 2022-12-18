package Class06_Switch;
import java.util.Scanner;

public class LargestScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter first number: ");
        int num1 = input.nextInt();
        System.out.println("Please Enter second number: ");
        int num2 = input.nextInt();
        System.out.println("Please Enter third number: ");
        int num3 = input.nextInt();

        int largest = 0;
        if(num1>num2 && num1 > num3) {
            largest = num1;
        }else if(num2 > num1 && num2 > num3) {
            largest = num2;
        }else {
            largest = num3;
        }
        System.out.print(largest+" is the larges number and ");
        if(largest % 2 == 0) {
            System.out.println("is an Even number.");
        }else {
            System.out.println("is an Odd number.");
        }
    }

}
