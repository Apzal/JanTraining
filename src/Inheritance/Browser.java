package Inheritance;

public  class Browser {
    boolean isOpened;
    private boolean isMaximised;



    public Browser(boolean isOpened){
        this.isOpened= isOpened;
    }

    @Override
    public String toString() {
        return "Browser";
    }

    int openBrowser(boolean isOpened, boolean size){
        System.out.println("Open Browser");
        return 1;
    }

    protected void closeBrowser(){
        System.out.println("Close Browser");
    }
}
