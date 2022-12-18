package Class25_Iterator_Collection;

import java.util.ArrayList;
//Create a Linked List that will store Integer Objects from 50-100.
//Once Linked List is created remove all numbers that are not divisible by 3.
//Print Linked List
//**Expected Output**
//[51, 54, 57, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99]
public class Hw3EvenNumDivByFive {
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

