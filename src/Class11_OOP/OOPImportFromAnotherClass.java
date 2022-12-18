package Class11_OOP;

public class OOPImportFromAnotherClass {

	public static void main(String[] args) {
		
		
		PhoneOOP iphone=new PhoneOOP();	
//import from another class ^^^^^^
		iphone.make="Apple";
		iphone.model="Iphone 13 Pro";
		iphone.color="Black";
		iphone.storage=256;
		iphone.size=6.7;
		iphone.cheap=false;
		
		iphone.takePicture();
		
		System.out.println("******************************************");
		

		PhoneOOP samsungPhone=new PhoneOOP();
		samsungPhone.make="Samsung";
		samsungPhone.model="S22 Ultra";
		samsungPhone.color="grey";
		samsungPhone.storage=256;
		samsungPhone.size=6.7;
		samsungPhone.cheap=false;
		
		samsungPhone.call();
		
	}
	
}
