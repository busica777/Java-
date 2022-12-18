package HelpNotes;
//Create an arrayList of type Integer.
//add below values.
//111
//111
//111
//999
//999
//999
//Print all the values of List 1 by 1:
//**Expected Output:**
//111
//111
//111
//999
//999
//999
import java.util.ArrayList;

public class Repl185_ArrayList_PrintAll_Numbers {


        public static void main(String[]aaaa){
            ArrayList<Integer> nums=new ArrayList<>();

            nums.add(111);
            nums.add(111);
            nums.add(111);
            nums.add(999);
            nums.add(999);
            nums.add(999);

            for(int i=0;i<nums.size();i++){
                System.out.println(nums.get(i));
            }

        }
    }


