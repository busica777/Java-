package Class24_Collection;

import java.util.ArrayList;

//Create an ArrayList that will store 5 names into it.
//Find out whether the given ArrayList is empty or not?
//Check whether the specific name is present in an ArrayList or not?
//Find the size of your arrayList and print all values from that
public class HW_ArrayList_5parameters {
    public static void main(String[] args) {
        ArrayList<String> names =new ArrayList<>();
        names.add("Jimmy");
        names.add("Breannan");
        names.add("Sam");
        names.add("Ion");
        names.add("Burger");

        if(names.isEmpty()){
            System.out.println("Array list is empty.Please add names");
        }else{
            System.out.println("Array list is not empty");
        }
        if(names.contains("Sam")){
            System.out.println("Sam name is present in this array");
        }
        System.out.println(names.size());
        System.out.println(names);
        }
    }



