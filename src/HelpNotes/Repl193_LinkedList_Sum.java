package HelpNotes;

import java.util.LinkedList;
//Create Linked List that will store Integer Objects
//Add the values below:
//111
//222
//333
//444
//555
//666
//Create a logic to calculate sum of the all the values in list.
//Print the result of sum.
public class Repl193_LinkedList_Sum {
    public  static void  main(String[]juhg){
        LinkedList<Integer> num=new LinkedList<>();
        num.add(111);
        num.add(222);
        num.add(333);
        num.add(444);
        num.add(555);
        num.add(666);

        int  sum=0;
        for(Integer i:num) {
            sum+=i;}
        System.out.println("Result of sum is "+sum);
    }
}

