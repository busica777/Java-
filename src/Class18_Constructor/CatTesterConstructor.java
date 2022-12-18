package Class18_Constructor;

public class CatTesterConstructor {
    public static void main(String[] args) {
        CatConstructor cat=new CatConstructor ("kitty", "Dsh", 10, 4);

   cat.printInfo();

        CatConstructor cat2=new CatConstructor("Markiz", "leo");
        cat2.printInfo();
    }
}
