package HelpNotes;

import java.util.ArrayList;

public class Repl188_LinkedList {
    public static void main(String[] args) {
        /*
        Create an arrayList of even numbers from 1 to 500. Remove any number that
        is divisible by 5 from that arrayList.
         */
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 2; i <= 500; i +=2) {//or->i=i+2
            numbers.add(i);
        }
        System.out.println(numbers);
        var it=numbers.iterator();
        while(it.hasNext()){//  hasNext-return true if any elements are left  inside  the  iterator
            Integer num=it.next();
            if(num%5==0){
                it.remove();
            }
        }
        System.out.println(numbers);
    }
}


