package Class30_Exseptions;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        try{ //the code that java will try, if anything  goes wrong,  java goes to  catch part
            String name = null;
            //if we don't have errors normal code is  executed,the code from try
            // System.out.println(name.length());//line that contains issues-an exception
            System.out.println("code in the try  block");
        }catch(Exception exc){ //catch the error-if wrong, execute catch part
            System.out.println("Backup code");//the code that we will write
        }
        System.out.println("some important lines of code 1");
        System.out.println("some important lines of code 2");
        System.out.println("some important lines of code 3");
        System.out.println("some important lines of code 4");

        System.out.println("some important lines of code 5");
        System.out.println("some important lines of code 6");
        System.out.println("some important lines of code 7");
    }
}
