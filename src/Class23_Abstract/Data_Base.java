package Class23_Abstract;

 public abstract class Data_Base {
     abstract void openDatabase();
     abstract void readData();
     abstract void writeData();
     abstract void closeDatabase();
 }
/*
Hover over the error and click on the implement methods option
 */
class MicrosoftDataBase extends Data_Base{


    @Override
    void openDatabase() {
        System.out.println("Opening the Microsoft Database");
    }

    @Override
    void readData() {
        System.out.println("Reading the data from MSDatabase");
    }

    @Override
    void writeData() {
        System.out.println("writing the data to MSDataBase");
    }

    @Override
    void closeDatabase() {
        System.out.println("Closing the MSDatabase");
    }
}

class Oracle extends Data_Base {


    @Override
    void openDatabase() {
        System.out.println("Opening the Oracle database");
    }

    @Override
    void readData() {
        System.out.println("Reading the data from Oracle databse");
    }

    @Override
    void writeData() {
        System.out.println("Writing the data to Oracle database");
    }

    @Override
    void closeDatabase() {
        System.out.println("Closing the Oracle database");
    }
}
