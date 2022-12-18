package Class19_Inheritance;
//Write program for multilevel inheritance where class C inherits from class B and Class B inherits from Class A.
import javax.sound.midi.Soundbank;

 class PizzaHWMultilevelInheritance {
      String cheese;
      String pepperoni;

      String pepper;
   public  PizzaHWMultilevelInheritance(String cheese, String pepperoni,String pepper) {
         this.cheese = cheese;
         this.pepperoni=pepperoni;
         this.pepper=pepper;

     }
     public void cookpizza() {

         System.out.println("This is pizza with " + cheese+", "+pepperoni+" and "+pepper);


     }
 }
class pizza1 extends PizzaHWMultilevelInheritance {
     public pizza1(String cheese, String pepperoni, String pepper){

    super( cheese,pepperoni, pepper) ;
    }
}
class pizza2 extends  pizza1{
    public pizza2(String cheese,String pepperoni, String pepper) {

        super(cheese, pepperoni, pepper);

    }
 }
    class TesterPizza{
        public static void main(String[] args) {
            pizza2 out=new pizza2("Swiss chese","pepperoni","green pepper");
            out.cookpizza();
        }
    }


