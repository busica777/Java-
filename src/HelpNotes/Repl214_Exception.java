package HelpNotes;

public class Repl214_Exception {
    public static void main(String []aaaa) throws SyntaxStudentException{

        try{
            gradeCheck(91);
        }catch  (Exception r){

            System.out.println (r);
        }
    }
    private static void gradeCheck(int score )throws SyntaxStudentException{

        if (score>90){
            throw new SyntaxStudentException("You are an exceptionally awesome student");
        }
        else if(score<90){
            throw new SyntaxStudentException("You are a great student");
        }
    }
}
class SyntaxStudentException extends Exception{


    public SyntaxStudentException(String message){
        super(message);
    }

}

