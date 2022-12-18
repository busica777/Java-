package Class22_;
public class WebDriverTester {
    public static void main(String[] args) {
       /* Safari safari=new Safari(); //this way  is too long
        safari.startBrowser();
        safari.test();
        safari.closeBrowser();

        Chrome chrome=new Chrome();
        chrome.startBrowser();
        chrome.test();
        chrome.closeBrowser();

        FireFox fireFox=new FireFox();
        fireFox.startBrowser();
        fireFox.test();
        fireFox.closeBrowser();/


        /Chrome chrome=new Chrome();
        FireFox fireFox=new FireFox();
        Safari safari=new Safari();
        WebDriver[] browsers={chrome,fireFox,safari};/
        /
        Creating objects of all Child classes and storing them in an array of type WebDriver we can do this because
        upcasting allows us to do this
         */
        //polymorphism
        WebDriver[] browsers={new Chrome(),new FireFox(),new Safari()};//constructors
        for(WebDriver browser:browsers){
            browser.startBrowser();
            browser.test();
            browser.closeBrowser();
        }
        for(int i=0;i< browsers.length; i++){
            browsers[i].startBrowser();
            browsers[i].test();
            browsers[i].closeBrowser();
        }
    }
}