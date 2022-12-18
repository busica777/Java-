package HelpNotes;
//Declare static variable in class level as below and assign its value:
//
//String ss="Welcome To Syntax Technologies"
//
//Access variable in the main method and print it using three ways you learned so far
//
//Hint:
//
//first way: By calling directly
//
//Second way: By using the className
//
//Third way: By creating the object of the class
public class Repl124Static_PrintMain_ByClassName_ByObj {

    static String ss="Welcome To Syntax Technologies";

    static void print(){
        System.out.println(ss);
    }
    public static void main(String[] args){
        System.out.println(ss);
        System.out.println(Repl124Static_PrintMain_ByClassName_ByObj.ss);


        Repl124Static_PrintMain_ByClassName_ByObj obj=new Repl124Static_PrintMain_ByClassName_ByObj();
        obj.print();
    }

}

