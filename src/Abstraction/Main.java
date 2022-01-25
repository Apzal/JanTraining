package Abstraction;

public class Main {
//    Browser browser;
    public static void main(String[] args) {
      Chrome chrome = new Chrome();







    }

    public static Browser change(String browserName){
        Browser browser;
        switch (browserName.toLowerCase()){
            case "chrome":
                browser=new Chrome();
            case "firfox":
                browser=new FireFox();
            default:
                browser = new Chrome();
        }

        return browser;
    }
}
