package HelpNotes;
/*Create a method that will do temperature check. Anytime user passes temperture that is below 32 method should throw an Exception saying "It is freezing"

In Main method call the method and handle an Exception

**Expected Output:**
java.lang.RuntimeException: It is freezing*/
public class Repl213_RunTimeException_IF {
    public static void main (String[]aaaa) throws Exception {
        try{
            temperatureCheck(20);
        }catch(Exception r){
            System.out.println( r);}
    }
    public static void temperatureCheck(int temp) throws Exception{
        if(temp<32){
            throw new RuntimeException("It is freezing");
        }
    }
}
