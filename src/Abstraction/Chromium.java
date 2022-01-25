package Abstraction;

public class Chromium extends Chrome implements Browser,MobileBrowser {
    @Override
    public void closeBrowser() {
        System.out.println("Chromium close Browser");


    }

    @Override
    public void openBrowser() {
        System.out.println("Chromium open Browser");
    }

    @Override
    public int getScreenSize() {
        return 0;
    }

    @Override
    public void navigate() {
        System.out.println("Chromium navigate");
    }
}
