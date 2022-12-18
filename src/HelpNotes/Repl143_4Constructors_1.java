package HelpNotes;

public class Repl143_4Constructors_1 {


        public static void main(String[] args) {
            HelpNotes.Repl143_4Constructors m1 = new HelpNotes.Repl143_4Constructors("Toyota", "Prius", 4, 120, 30000.0);
            m1.display();

            HelpNotes.Repl143_4Constructors m2 = new HelpNotes.Repl143_4Constructors("Toyota", "Prius", 4, 120, 30000.0);
            m2.display();

            HelpNotes.Repl143_4Constructors m3 = new HelpNotes.Repl143_4Constructors("unknown", "unknown", 4, 120, 30000.0);
            m3.display();

            HelpNotes.Repl143_4Constructors m4 = new Repl143_4Constructors("Toyota", "Prius", 4, 90, 0.0);
            m4.display();

        }
    }

