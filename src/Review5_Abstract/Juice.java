package Review5_Abstract;


    class Drink{
        String str;
        void drink(){
            System.out.println("drinking method");
        }
        //final methods can't be overriden
        protected final void enjoy(){
            System.out.println("we enjoy drinking water");
        }
    }
//CE;: The tupe juice cannot subclass the final class
    //public class Juice extends Drink{
        /*CE: can't override the final method drom Drink
        public void enjoy(){
            System.out.println("we enjoy drinking juice");

        }*/


