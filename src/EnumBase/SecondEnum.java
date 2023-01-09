package EnumBase;

import java.sql.SQLOutput;

public class SecondEnum {

    enum Flavor {
        CHOCOLATE, VANILLA, MINT;


    }

    public static void main(String[] args) {
        Flavor taste = Flavor.VANILLA;


        if (taste == taste.VANILLA) {
            System.out.println("It's Vanilla");
        } else if (taste == taste.CHOCOLATE) {
            System.out.println("It's chocolate");
        } else if (taste == taste.MINT) {
            System.out.println("It's mint");
        }

    }



    }

