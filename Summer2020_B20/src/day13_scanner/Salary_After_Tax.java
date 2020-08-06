package day13_scanner;
import java.util.Scanner;
public class Salary_After_Tax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your Annual Salary");
        double salary = scan.nextDouble();
        System.out.println("Enter your State's tax rate");
        double stateRate = scan.nextDouble();
        System.out.println("Enter the Federal tax rate");
        double fedRate = scan.nextDouble();

        double taxSalary = salary * stateRate;
        double taxSalary2 = salary * fedRate;
        double actualSalary = salary - taxSalary - taxSalary2;

        System.out.println("Your Annual Salary: $" + salary);
        System.out.println("State Taxes: $" + taxSalary);
        System.out.println("Federal Taxes: $" + taxSalary2);
        System.out.println("What you take home: $" + actualSalary);
    }
}
