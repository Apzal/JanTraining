package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionExample {

    public static void main(String[] args) {

        try{
            calculate();
        }
        catch (PhoneNumberException e){
            System.out.println(e.getMessage());
        }



    }

    public static void calculate() throws PhoneNumberException  {

          String number = "12345678901";

          if(number.length()>10)
            throw new PhoneNumberException("Number not correct");








    }


}
