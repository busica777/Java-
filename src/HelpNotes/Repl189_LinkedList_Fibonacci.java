package HelpNotes;

import java.util.LinkedList;
//Create Linked List that will store first 10 numbers of fibonacci series
//Print number from Linked List 1 by 1 all in 1 line
//**Expected Output:**
//0 1 1 2 3 5 8 13 21 34
public class Repl189_LinkedList_Fibonacci {
    public static void main(String[]aaaa){
        LinkedList<Integer> fn=new LinkedList<>();
        int a=0;
        int b=1;
        int c=0;
        for(int i=0;i<=10;i++){
            fn.add(a);
            c=a+b;
            a=b;
            b=c;
        }
        for(int i=0;i<10;i++){
            System.out.print(fn.get(i)+" ");
        }
    }
}

