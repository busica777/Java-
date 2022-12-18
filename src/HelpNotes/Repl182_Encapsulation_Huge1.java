package HelpNotes;

public class Repl182_Encapsulation_Huge1 {

        public static void main(String[]aaaa){
            HelpNotes.Repl182_Encapsulation_Huge obj=new Repl182_Encapsulation_Huge("John","Doe",10,25,1900,"123-45-6789");
            System.out.println(obj.getFirstname());
            System.out.println(obj.getLastname());

            obj.formatBirthday();

            System.out.println(obj.getSsn());

        }
    }