package Inheritance;

public class Chrome extends Browser {

    boolean isChromeOpened = false;

    @Override
    public String toString() {
        return "chrome";
    }

    public Chrome(boolean isChromeOpened){
        super(isChromeOpened);
        this.isChromeOpened = isChromeOpened;

    }

    @Override
    public int openBrowser(boolean isChromeOpened,boolean size){
        // initialise code from Parent Method
        super.openBrowser(isChromeOpened,size);
        // create custom code for Chrome Class
        return 1;
    }





    public void addGoogleExtensions(){


        System.out.println("add google extension");
    }

    public void googleSettings(){
        System.out.println("Google Settings");
    }



}
