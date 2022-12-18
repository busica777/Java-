package Class30_Exseptions;

public class FinallyBlockDemo {
    public static void main(String[] args) {

        try {
            System.out.println(10 / 0);//if we comment out this code, finally will always execute
        } catch (ArithmeticException ae) {
            System.out.println("Operation not allowed");
        } finally {//will execute no  matter  what is in try/catch
            System.out.println("This Block  is always executed no matter what");
        }
        System.out.println("1");
    }

}


