package Class21_Methods;

public class Browser {

    void openBrowser(){
        System.out.println("Opening a FromClass16.RewievClasses.src.Class21.Browser");
    }
    void navigate(){
        System.out.println("Opening the url");
    }
    void test(){
        System.out.println("Testing the webpage");
    }
    void closeBrowser(){
        System.out.println("Closing the browser");
    }
}
class Chrome extends Browser{
    void openBrowser(){
        System.out.println("Opening the browser in less than  1 sec");
    }
}
class FireFox{
    void openBrowser(){
        System.out.println("Opening the browser in less than  2 sec");
    }
}