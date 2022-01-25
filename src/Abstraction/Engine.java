package Abstraction;

public class Engine {

    public void start(){
        if(isBatteryUp() && isCharged())
            System.out.println("Start Engine");
        System.out.println("Not Started");
    }

    private boolean isBatteryUp(){
        return true;
    }

    private boolean isCharged(){
        return true;
    }

    public void stop(){
        stopByUserCommand();
    }

    private boolean stopByUserCommand(){
        return true;
    }
}
