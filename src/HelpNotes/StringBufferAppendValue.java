package HelpNotes;
//Instantiate and StringBuffer class
//
//Append Value "Hello" to it
//
//Append value "World" to it.
//
//Print in UPPERCASE.
public class StringBufferAppendValue {
    public static void main(String[] args) {

        StringBuffer str=new StringBuffer("Hello ");

        str.append("World");

        String s=str.toString();

        s=s.toUpperCase();

        System.out.println(s);
    }
}


