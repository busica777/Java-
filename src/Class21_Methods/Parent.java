package Class21_Methods;

public class Parent {
    void getMarry(){
        System.out.println("You will marry the girl that we will select for you");
    }
}

class Zam extends Parent{
    @Override
    void getMarry(){
        System.out.println("I want to marry Taylor Swift");

    }
}
class  Test{
    public static void main(String[]aaaa){
        Zam zam=new Zam();
        zam.getMarry();
    }
}