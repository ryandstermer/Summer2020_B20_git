package day06;

public class Salary_Calculator {
    public static void main(String[] args) {
        double rate = 55;
        double stateTaxRate = 0.08;
        double federalTaxRate = 0.22;
        int weeklyHours = 48;

        double salary = rate * weeklyHours * 48;

        System.out.println("Salary Before Tax: " + salary + " USD");

        double totalTaxRate = stateTaxRate + federalTaxRate;
        double totalTax = salary * totalTaxRate;

        System.out.println("Total Tax: " + totalTax + " USD");
        System.out.println("Take Home Salary: " + (salary - totalTax) + " USD");

    }
}
