package Class11_OOP;

public class OOPPhone3Objects {

	String make;
	String model;
	String color;
	int price;
	int weight;
	double size;
	boolean waterproof;
	
	void call() {
		System.out.println("Calling....");	
	}
	void calculate() {
		System.out.println("Calculating numbers....");
	}
	void playmusic() {
	System.out.println("Playing Music....");	
	}
public static void main(String[]aaaa) {
	
	OOPPhone3Objects iphone=new OOPPhone3Objects();
	
	iphone.make="Aplle";
	iphone.model="14 pro max";
	iphone.color="Blue";
	iphone.price=1350;
	iphone.weight=128;
	iphone.size=6.7;
	iphone.waterproof=true;
	
	System.out.println("Make and model: "+iphone.make+" "+iphone.model);
	iphone.playmusic();
	
	
	System.out.println("***************************");
	
	
	OOPPhone3Objects Pixel=new OOPPhone3Objects();
	Pixel.make="Google";
	Pixel.model="Pixel 6";
	Pixel.color="Black";
	Pixel.price=1100;
	Pixel.weight=135;
	Pixel.size=6.4;
	Pixel.waterproof=true;
	
	System.out.println("Make and model: "+Pixel.make+" "+Pixel.model);
	Pixel.call();
	
	System.out.println("***************************");
	
	OOPPhone3Objects Samsung=new OOPPhone3Objects();
	
	Samsung.make="Samsung";
	Samsung.model="Galaxy Ultra";
	Samsung.color="Black";
	Samsung.price=1350;
	Samsung.weight=120;
	Samsung.size=6.5;
	Samsung.waterproof=true;
	
	System.out.println("Make and model: "+Samsung.make+" "+Samsung.model);
	Samsung.calculate();
	
	
	
	
	
}
	
}
