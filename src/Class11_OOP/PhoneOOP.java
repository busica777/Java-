package Class11_OOP;

public class PhoneOOP {

	String make;
	String model;
	String color;
	int storage;
	double size;
	boolean cheap;
	void call() {
		System.out.println("calling.....");
	}
	void takePicture() {
		System.out.println("Taking pictures");
	}
	public static void main(String[]aaaa) {
	//Name of  Class variable name=new Name of class();	
	
		PhoneOOP iphone=new PhoneOOP();
		
		iphone.make="Apple";
		iphone.model="Iphone 14";
		iphone.color="Black";
		iphone.storage=128;
		iphone.size=6.8;
		iphone.cheap=false;
		System.out.println("Make "+iphone.make+" Model "+iphone.model);
		iphone.call();
		
		System.out.println("************************");
		
		PhoneOOP samsungPhone=new PhoneOOP();
		samsungPhone.make="Samsung";
		samsungPhone.model="S22 Ultra";
		samsungPhone.color="grey";
		samsungPhone.storage=256;
		samsungPhone.size=6.7;
		samsungPhone.cheap=false;
		
		System.out.println(iphone.make);
		
		System.out.println(samsungPhone.make);
		
	}
}
