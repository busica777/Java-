package Class19_Inheritance;
//Write a Java program called Teacher.
// Identify features and behaviour of that Class. Create 3 subclasses MathTeacher,
// ChemistryTeacher and PianoTeacher that would have it their own features and behaviour.
// Test all 4 classes
public class TeacherHierarchicalInheritance {
     String name;

     boolean funny;
     String city;
     int experience;

    public TeacherHierarchicalInheritance(String name, boolean funny, String city, int experience){
        this.name=name;
        this.funny=funny;
        this.city=city;
        this.experience=experience;
    }
     void print(){
        if(funny==true){
        System.out.println("This is teacher "+name+" from "+ city+" with "+experience+" years of experience");
    }else{
            System.out.println("This is teacher "+name+" from "+city+" with "+experience+" years of experience. This teacher is serious.");
        }
}

    public static void main(String[] args) {
        TeacherHierarchicalInheritance teacher=new TeacherHierarchicalInheritance("Jenny",false,"Oakmont",11);
        teacher.print();
    }}

class PianoTeacher extends TeacherHierarchicalInheritance{

    private final String mood;

    public PianoTeacher(String name, boolean funny, String city, int experience, String mood) {
        super(name, funny, city, experience);
        this.mood=mood;
    }
    void printPianoTeacher(){
        System.out.println(name+" teaches class of piano always in "+mood+" mood.");
    }
}