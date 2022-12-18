package HelpNotes;
import java.util.ArrayList;
//Create a array list that will hold Integer Objects:
//Add below elements to it.
//111
//222
//333
//444
//555
//666
//Print first, third and fifth element from your array
//**Expected Output:**
//111
//333
//555
public class Repl184_ArrayList_PrintOddNumbers {
        public static void main(String[]aaaa){
            ArrayList<Integer> nums=new ArrayList();
            nums.add(111);
            nums.add(222);
            nums.add(333);
            nums.add(444);
            nums.add(555);
            nums.add(666);
            //System.out.println(nums.get(0));
            // System.out.println(nums.get(2));
            // System.out.println(nums.get(4));
    /*for(int i=111; i<=nums.size(); i+=2){
    }
    System.out.println(nums);*/
            var it=nums.iterator();
            while(it.hasNext()){
                Integer num=it.next();
                if(num%2==0){
                    it.remove();
                }
            }
            for(Integer num1:nums){
                System.out.println(num1);
            }
        }
    }

