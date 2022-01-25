package Encapsulation;

public class Employee {

    public static void main(String[] args) {
        var apzal = new CalculateSalary();
        var elango=
                new CalculateSalary(10000,200,30000);

        var dinesh=
                new CalculateSalary(15000,100,20000);

        System.out.println("Salary"+elango.calculateSalary());
        System.out.println("Bonus"+elango.getBonus());
        System.out.println("Salary"+dinesh.calculateSalary());
        System.out.println("Bonus"+dinesh.getBonus());

        var john = new CalculateSalary(10000);
        System.out.println("Bonus"+john.getBonus());
//        System.out.println(elango.calculateAllowance(1.5F));
//        System.out.println(CalculateSalary.employeeCount);




    }



}
