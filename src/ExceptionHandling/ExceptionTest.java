package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest {
    public static void main(String[] args) throws FileNotFoundException{
        int sum = 10;
        int[] numbers = {1,2,3,4,5};
        for(int i= 5; i>=0;i--){
            //int average = (sum+i)/i;
            numbers=null;
        }

        System.out.println(numbers.length);
//        try{
//            FileInputStream fileInputStream = new FileInputStream("D:\\Training\\AutomationTesting-Jan\\test1.txt");
//
//        }
//        catch (FileNotFoundException e){
//            System.out.println("In File Not found Exception block");
//        }
//
//        catch (Exception e){
//            System.out.println("In Exception block");
//        }




    }
}
