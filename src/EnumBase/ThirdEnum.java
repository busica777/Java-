package EnumBase;

public class ThirdEnum {
enum Flavor{
    CHOCOLATE, MINT, VINILLA;
    public static void getMint() {
        System.out.println(Flavor.MINT);
    }
}
    public static void main(String[] args) {
        Flavor taste = Flavor.MINT;
        taste.getMint();
    }
}
