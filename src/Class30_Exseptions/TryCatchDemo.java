package Class30_Exseptions;

public class TryCatchDemo {
    public static void main(String[] args) {

        try{//like if condition
            doSomething();
        } catch(NullPointerException npe){//like else condition
            System.out.println("Got null pointer exception");
        }catch(IndexOutOfBoundsException e){
            System.out.println("Got index out of  bound  this time");
        }catch(NegativeArraySizeException e) {
            System.out.println("John  we can't create arrays with  negative size");
        }catch(ArithmeticException e){
            System.out.println("This  operation  is not supported in  Math");
        }catch(Exception e){//Exception class can  handle any  type of  exception
            System.out.println("I can handle any type  of exceptions");
        }
    }
    public static void doSomething(){
        //  String  name=null;
        // System.out.println(name.length());

  /*  int arr[]=new int[1];  //Got index out of  bound  this time
    System.out.println(arr[10]);/

  /  String str="hghj"; //Got index out of  bound  this time
    str.charAt(20);*/

        System.out.println(101/0); //I can handle any type  of exceptions

    }
}

