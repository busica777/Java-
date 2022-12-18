package HelpNotes;

import java.util.HashSet;
/*
Create the HashSet with list of Integers add the below numbers for the list
111
111
111
999
999
999
Print elements one by one.
Expected Output
999
111*/
public class Repl195_HashSet {

        public static void main(String[]aaaa){
            HashSet<Integer> hashSet=new HashSet<>();
            hashSet.add(111);
            hashSet.add(111);
            hashSet.add(111);
            hashSet.add(999);
            hashSet.add(999);
            hashSet.add(999);

            for(Integer hashs:hashSet){
                System.out.println(hashs+" ");
            }

        }

    }


