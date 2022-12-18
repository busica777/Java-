package Class18_Constructor;

public class InstanceThisKeyword {
    //Write a Student class   that have instance variables name and address.
// Create a constructor that will initialize those variables.
// Print name & address of given  student using displayInfo method.
String name;
String lname;
String address;

    public InstanceThisKeyword(String name, String lname, String address ){
        this.name=name;
        this.lname=lname;
        this.address=address;
    }

    void displayInfo(){
        System.out.println("The first name is "+name+"and the last name is "+lname+"The address is "+ address);

    }

    public static void main(String[] args) {
        new InstanceThisKeyword( "Sam ", "Lelher. ", "3482 S Albany Blvd, Seattle, WA 98345.").displayInfo();

        }
    }

