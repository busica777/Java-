package HelpNotes;
import java.util.Scanner;
import java.util.ArrayList;
public class Repl188_ArrayList_short {
        public static void main(String[] args) {
            ArrayList<Integer>numbers=new ArrayList<>();

            Scanner scan= new Scanner(System.in);

            int input;
            for(int i =0;i<5;i++){
                input = scan.nextInt();
                numbers.add(input);
            }

            numbers.forEach(s->System.out.print(s+" "));


        }
    }

