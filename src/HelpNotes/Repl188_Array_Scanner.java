package HelpNotes;

import java.util.Scanner;

//Using Scanner class add 5 elements into ArrayList and then print all elements from that ArrayList all in 1 line
//Numbers in:
//4
//62
//8
//5
//4
//**Expected Output:**
//4 62 8 5 4
public class Repl188_Array_Scanner {
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            int  arr[]=new int[]{4,62,8,5,4};
            for(int  i=0;i<arr.length;i++){
                System.out.print(arr[i] + " ");
            }
        }
    }

