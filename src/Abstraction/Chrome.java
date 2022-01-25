package Abstraction;

public class Chrome implements Browser{
    @Override
    public void closeBrowser() {
        System.out.println("Chrome Close Browser");
    }

    @Override
    public void openBrowser() {
        System.out.println("Chrome Open Browser");
    }

    @Override
    public void navigate() {

    }

    public void chromeSettings(){
        System.out.println("In Chrome Settings");
    }



}
