package Class22_;
//Create a class 'Degree' having a method 'getPrerequisite' that prints
// ""To get a degree you need high school diploma"".
//Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’.
// In Masters class override method 'getPrerequisite'.
//Call the method by creating an object of each of the three classes.
public class TaskDegree {
    public static void main(String[]args){
        TaskDegree degree=new TaskDegree();
        degree.getPrerequisite();
        Bachelors bachelors=new Bachelors();
        bachelors.getPrerequisite();
    }

    void getPrerequisite() {
        System.out.println("To get a degre you need high school diploma");
    }
}

class Bachelors extends TaskDegree {

}

class Masters extends TaskDegree {

   @Override
   void getPrerequisite() {
        System.out.println("To get a Master's degree you need Bachelors");
    }
}
