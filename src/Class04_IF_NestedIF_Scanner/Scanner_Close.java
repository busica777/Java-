package Class04_IF_NestedIF_Scanner;

import java.util.Scanner;

public class Scanner_Close {


        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число:");

            int number = sc.nextInt();

            System.out.println("Спасибо! Вы ввели число " + number);

            sc.close();//Stops the scanner

        }
    }

