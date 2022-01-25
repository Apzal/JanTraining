package Abstraction;

public class FireFox implements Browser{
    @Override
    public void closeBrowser() {
        System.out.println("Firefox Close Browser");
    }

    @Override
    public void openBrowser() {
        System.out.println("Firefox Open Browser");
    }

    @Override
    public void navigate() {

    }
}
