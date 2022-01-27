package ExceptionHandling;

public class PhoneNumberException extends  Exception{
    public PhoneNumberException(String message){
        super(message);
        System.out.println("Problem in phone number "+message);
    }
}
