package Review5_Abstract;

public class Abstract_Car_Test {
    public static void main(String[] args) {
        Abstraction_Car car=new Tesla("Tesla","X","Yellow");
        car.drive();
        car.start();
        car.stop();
        //car.charge(); cannot be used for car


        Tesla tesla=new Tesla("Tesla", "X","Green");
        tesla.drive();
        tesla.start();
        tesla.stop();
        tesla.charge();
        tesla.haveBreak();
        tesla.haveMotor();
        tesla.breaks();

        //new Abstraction_Car(); not possible
    }
}
