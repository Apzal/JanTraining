package Inheritance;

public class Main  {
    public static void main(String[] args) {

//        var chrome = new Chrome(true);
//        Chrome browser= new Chrome(true);
//
//
//        checkBrowser(chrome);
        Chrome chrome = new Chrome(true);


    }

    public static void checkBrowser(Browser browser){
        var chrome = (Chrome) browser;
        System.out.println(chrome.isChromeOpened);

    }


}
