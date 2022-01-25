package Abstraction;

public abstract class TaxCalculator {
    private int income = 100000;
    public abstract void calculateTax();

    public int getTaxableIncome(){
        return income;
    }


}
