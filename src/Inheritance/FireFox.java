package Inheritance;

public class FireFox extends Browser{

    public FireFox(boolean isOpened) {
        super(isOpened);
    }

    @Override
    public int openBrowser(boolean isFireFoxOpened,boolean size){
        super.openBrowser(isFireFoxOpened,size);
        return 1;
    }
}
