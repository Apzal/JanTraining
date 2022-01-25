package Encapsulation;

public class MethodOverloading {
    public static void multiplyNumber(){

    }

    public void divideNumber(){

    }
    public static void main(String[] args) {

        multiplyNumber();
        MethodOverloading methodOverloading = new MethodOverloading();
        methodOverloading.divideNumber();
        System.out.println(methodOverloading.addNumbers(10,20,30));


    }

    public int addNumbers(int firstNumber,int secondNumber,int thirdNumber){
        multiplyNumber();
        divideNumber();

        return addNumbers(firstNumber,secondNumber)+thirdNumber;

    }
    public int addNumbers(int firstNumber,int secondNumber){
       return firstNumber+secondNumber;
    }
}
