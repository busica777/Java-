package Class11_OOP;

public class OOPDOGHW {

	String breed;
	String name ;
	double weight;
	int age;
	boolean longfur;
	boolean active;
	
	
	void bark() {
	System.out.println("Barking...");	
	}
	void play() {
		System.out.println("Playing...");
	} 
	void protect() {
		System.out.println("Protecting...");	
	}
	public static void main(String[]aaaa) {
		
		OOPDOGHW Husky=new OOPDOGHW();
		
		Husky.breed="Husky";
		Husky.name="Shareek";
		Husky.weight=28.7;
		Husky.age=4;
		Husky.longfur=true;
		Husky.active=true;
		System.out.println("Breed and name: "+Husky.breed+" "+Husky.name);
		Husky.bark();		
		
		System.out.println("*************************************");
		
		OOPDOGHW Bulldog=new OOPDOGHW();{
			
			Bulldog.breed="Bulldog";
			Bulldog.name="Bobeek";
			Bulldog.weight=30.1;
			Bulldog.age=3;
			Bulldog.longfur=false;
			Bulldog.active=true;
			System.out.println("Breed and name: "+Bulldog.breed+" "+Bulldog.name );
			Bulldog.protect();
			
			System.out.println("**************************************");
			
			OOPDOGHW Labrador=new OOPDOGHW();
			
			Labrador.breed="Labrador";
			Labrador.name="Toozeek";
			Labrador.weight=35.3;
			Labrador.age=6;
			Labrador.longfur=true;
			Labrador.active=true;
			System.out.println("Breed and name: "+Labrador.breed+" "+Labrador.name);
			Labrador.play();
		}
		
	}
}
