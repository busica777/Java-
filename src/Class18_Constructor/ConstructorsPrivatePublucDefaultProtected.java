package Class18_Constructor;

public class ConstructorsPrivatePublucDefaultProtected {
    //Write a java class that have 4 constructors with 4 different access levels
    // of constructors(private,public,default,protected) and create 4 objects of this class:
    // 1 - inside same class; 2 - from outside the class;
    // 3 - from different class inside different package  and observe result.
    private ConstructorsPrivatePublucDefaultProtected(){
        System.out.println("Private");
    }
    ConstructorsPrivatePublucDefaultProtected(String name){
        System.out.println("Default");
    }
    protected ConstructorsPrivatePublucDefaultProtected(int name){
        System.out.println("Protected");
    }
    public ConstructorsPrivatePublucDefaultProtected(boolean isTrue){

    }

    public static void main(String[] args) {
        new ConstructorsPrivatePublucDefaultProtected();
        new ConstructorsPrivatePublucDefaultProtected("thank you Lubna");
        new ConstructorsPrivatePublucDefaultProtected(10);
        new ConstructorsPrivatePublucDefaultProtected(true);
    }
}
