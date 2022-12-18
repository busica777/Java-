package Class11_OOP;

public class PersonOOP {

String name;
int age;
double weight;
boolean isFunny;
double height;
boolean losinghair;

void study(){
	
	if(name.equals("Anna")) {
	System.out.println("I study hard");
		
	}else if(name.equals("Roman")) {
		System.out.println("I'll keep deleting the messages ans will not let any one to study");	
		
	}else {
		System.out.println("I try to study, but things don't make much sense");
	}
}
	public static void main(String[]aaaa) {
		PersonOOP person1=new PersonOOP();
		
		person1.name="Roman";
		person1.study();
		System.out.println("********************");
		
		PersonOOP person2=new PersonOOP();
		person2.name="Yusuf";
		person2.study();
	}
	
}
