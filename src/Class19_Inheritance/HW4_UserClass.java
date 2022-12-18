package Class19_Inheritance;

public class HW4_UserClass {
    /*
      Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
      Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
      Print users name, mobile number and address in userDetails method. Test your code.
       */
    String name;
    double mobileNumber;
    public HW4_UserClass(String name, double mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }
}
class userInfo extends HW4_UserClass{
    String address;
    public userInfo(String name, double mobilenumber,String address) {
        super(name, mobilenumber);
        this.address=address;
    }
    void userDetails(){
        System.out.println("My name ia "+name+", my phone number is "+mobileNumber+", my current home address is "+address);
    }
}
class tester6{
    public static void main(String[] args) {
        new userInfo("Tony", 876765534,"777 Bucshik St").userDetails();
    }
}