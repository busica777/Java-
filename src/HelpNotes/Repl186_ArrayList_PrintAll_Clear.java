package HelpNotes;

import java.util.ArrayList;

//Create an Arraylist of type Integer.
//Add below elements to it.
//111
//222
//333
//444
//555
//666
//Print the ArrayList.
//remove all the elements.
//Print the Arraylist.
//Expected Output:
//[111, 222, 333, 444, 555, 666]
//[]
public class Repl186_ArrayList_PrintAll_Clear {
    public static void main(String[]aaaa){
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(111);
        nums.add(222);
        nums.add(333);
        nums.add(444);
        nums.add(555);
        nums.add(666);

        System.out.println(nums);
        nums.clear();
        System.out.println(nums);
    }
}


