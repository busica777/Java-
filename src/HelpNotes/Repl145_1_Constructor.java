package HelpNotes;

public class Repl145_1_Constructor {
    String dogName;
    static String dogBreed="Mutt";
    double dogWeight;


    public Repl145_1_Constructor(String dogName, String dogBreed, double dogWeight){
        this.dogName=dogName;
        this.dogBreed=dogBreed;
        this.dogWeight=dogWeight;
    }
    public void display(){
        System.out.println(dogName+" "+dogBreed+" "+dogWeight);
    }
}