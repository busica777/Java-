package Class29_Maps_Excel;

import java.util.TreeMap;

public class HW_Map_Constructor_Employees {
    /*
  Create a Person class with following private fields: name, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.
In Test Class create a Map that will store key in ascending order.
In that map store personId and a Person Object. Print each object details.
   */
    private String  name;
    private String lastName;
    private int age;
    private double  salary;

    HW_Map_Constructor_Employees(String name,String lastName,int age, double salary){
        this.name=name;
        this.lastName=lastName;
        this.age=age;
        this.salary=salary;
    }
    void print(){
        System.out.println(name+" "+lastName+" "+age+" "+salary);
    }
}
class Test{
    public static void main(String[] args) {
        TreeMap<String, HW_Map_Constructor_Employees> names=new TreeMap<>();
        names.put("Id1",new HW_Map_Constructor_Employees("Erick","Bow",25,85000));
        names.put("Id2",new HW_Map_Constructor_Employees("Diane", "Smith", 24, 80000));
        names.put("Id3",new HW_Map_Constructor_Employees("Victoria","Seivers",43,120000));
        System.out.println(names);
        for(var key:names.keySet()){
            names.get(key).print();
        }
    }
}

