package Encapsulation;

public class CalculateSalary {
    private int basicComponentSalary;
    private int hourlyRate;
    private int bonus;
    static int employeeCount;

    public  CalculateSalary(){

    }
    public CalculateSalary(int basicComponentSalary,int hourlyRate,int bonus){
        this(bonus);
        this.basicComponentSalary = basicComponentSalary;
        this.hourlyRate= hourlyRate;
        employeeCount++;
    }

    public CalculateSalary(int bonus){
        //30 to 40 lines of code
            this.bonus=bonus;
    }
    public void setBasicSalary(int basicSalary){
        this.basicComponentSalary= basicSalary;

    }

    public int getBonus(){
        return bonus;
    }

    public int getBasicSalary(){
        return basicComponentSalary;

    }
    public int calculateSalary(){
        return basicComponentSalary;
    }


    public int calculateAllowance(float percentage){
        return (int)(basicComponentSalary*percentage);

    }




}
