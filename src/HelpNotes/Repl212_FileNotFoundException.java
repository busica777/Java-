package HelpNotes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
* Create a method that will not be handling exception and throwing it at caller.

In main method call method and handle the exception.

**Expected Output:**

```
java.io.FileNotFoundException:  (No such file or directory)*/
public class Repl212_FileNotFoundException {
    public static void method(String path) throws
            FileNotFoundException {

        FileInputStream yox=new FileInputStream(path);
    }
    public static void main(String [] args){
        try{
            method("");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

