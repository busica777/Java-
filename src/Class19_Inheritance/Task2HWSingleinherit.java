package Class19_Inheritance;
//Write program to inherit class A that has method printF which is static and call or reuse that method into class B
public class Task2HWSingleinherit {
    String name;
    String color;
    int age;

    static void printF() {
        System.out.println("It takes time to learn how to code properly");
    }
}
    class Task2Part2 extends Task2HWSingleinherit{
        public static void main(String[] args) {
            Task2Part2.printF();
        }
    }

