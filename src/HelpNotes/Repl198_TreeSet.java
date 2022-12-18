package HelpNotes;
/*
* Create Set to store String Objects and you want them to be stored in ascending order
Please add the below values and see the result
"India"
"Australia"
"South Africa"
"India"
"America"
"America"
Print the Set.
Expected Output:
[America, Australia, India, South Africa]
*/
import java.util.TreeSet;
public class Repl198_TreeSet {
    public static void main(String[]aaaa){
        TreeSet<String> tr=new TreeSet<String>();
        tr.add("India");
        tr.add("Australia");
        tr.add("South Africa");
        tr.add("India");
        tr.add("America");
        tr.add("America");
        // Iterator<String> itr=tr.iterator();
//while(itr.hasNext()){
        //System.out.print(itr.next()+", ");
//}
        System.out.println(tr);

    }

}

