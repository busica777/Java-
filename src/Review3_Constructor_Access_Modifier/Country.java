package Review3_Constructor_Access_Modifier;


public class Country {

    public String name;
    protected String capital;
    int population;
    private String president;

    Country(String name){
        this.name=name;
    }
}