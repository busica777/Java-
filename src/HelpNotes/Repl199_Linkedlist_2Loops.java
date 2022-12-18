package HelpNotes;
/*Create a Set collection in which you want to preserve an order of inserted String Objects.
Add the below values
- null
- Sohil
- Diego
- Alijon
- Asel
- Sumair
Print values 1 by 1 using loop and Iterator
null
Sohil
Diego
Alijon
Asel
Sumair
null
Sohil
Diego
Alijon
Asel
Sumair*/
import java.util.Iterator;
import java.util.LinkedList;
public class Repl199_Linkedlist_2Loops {
    public static void main(String[]aaaa){
        LinkedList<String> linkedlist=new LinkedList<>();
        linkedlist.add("null");
        linkedlist.add("Sohil");
        linkedlist.add("Diego");
        linkedlist.add("Alijon");
        linkedlist.add("Asel");
        linkedlist.add("Sumair");

        LinkedList<String>linkedlist2 =new LinkedList<>();
        linkedlist2.add("null");
        linkedlist2.add("Sohil");
        linkedlist2.add("Diego");
        linkedlist2.add("Alijon");
        linkedlist2.add("Asel");
        linkedlist2.add("Sumair");

        Iterator<String> itr=linkedlist.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        for(String str:linkedlist2){
            System.out.println(str);
        }
    }
}
