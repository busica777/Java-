package HelpNotes;
import java.util.ArrayList;
import java.util.Iterator;
/*Create an ArrayList of type boolean called listA and add below values
(true, false, false)
Create another array list call listB and ad all values from List A into it
Using iterator print all values from ListB 1 by 1
**Expected Output:**
true
false
false*/
public class Repl191_ArrayList_Iterator {
    public static void main(String[]aaaa){
            ArrayList<Boolean> listB=new ArrayList<>();
            listB.add(true);
            listB.add(false);
            listB.add(false);

            ArrayList<Boolean> listA=new ArrayList<>();
            listA.add(true);
            listA.add(false);
            listA.add(false);

            Iterator<Boolean> iterator=listB.iterator();
            while(iterator.hasNext()){
                Boolean item=iterator.next();

            }
            for(Boolean list:listB){
                System.out.println(list);
            }

        }
    }

