package Class23_Abstract;

public interface Person {//very rare used
    void eat();
}
interface Employee{
    void work();
}
interface SyntaxEmployee extends Employee, Person{
    void creaRepl();
}
class Asghar implements SyntaxEmployee{

    @Override
    public void eat() {
        System.out.println("Like to eat grilled Fish");
    }

    @Override
    public void work() {
        System.out.println("Teaches Batch14");
    }

    @Override
    public void creaRepl() {
        System.out.println("Create easy Repls");
    }
}


