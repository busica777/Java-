package Review_Logical_Switch;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO DOUBLE DISCOUNT

	double discount;	
	
	char code='C';
	
	switch(code){
	case'A':
		discount=0.0;
		break;
	case 'B':
		discount=0.1;
		break;
	case 'C':
		discount=0.2;
		break;
		default:
			discount=0.3;
		}
	System.out.println(code);
	}

}
