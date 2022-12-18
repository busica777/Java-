package JavaRush;
/*
* TASK3: Use the keyboard to enter three names, then display:
"name1" + "name2" + "name3" = Pure love. Ooo la-la!

Expected output:
Kevin + Eva + Angelica = Pure love. Ooo la-la!*/
import java.util.Scanner;

public class Scanner_3Strings {

        public static void main(String[] args) throws Exception {
            Scanner sc=new Scanner(System.in);

            String name1 = sc.nextLine();
            String name2 = sc.nextLine();
            String name3 = sc.nextLine();

            System.out.println(name1+" + "+name2+" + "+ name3 +" = Pure love. Ooo la-la!");
        }
    }

