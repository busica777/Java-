package HelpNotes;

import java.util.HashSet;
//Create a Set and  below values to it.
//[third, first, second]
//Print HashSet and then remove all the elements from Hashset and print it again.
//Expected Output:
//[third, first, second]
//[]
public class Repl196_HashSet_remove {

        public static void main(String[]aaaa){
            HashSet<String> hashSet=new HashSet<>();
            hashSet.add("third");
            hashSet.add("first");
            hashSet.add("second");

            System.out.println(hashSet);
            hashSet.clear();
            System.out.println(hashSet);
        }
    }

