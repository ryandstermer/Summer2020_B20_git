package day03_sequences_variables;

public class Salary_Calculator {
    public static void main(String[] args) {
        double salary = 150000;
        double tax = 0.28;
        double totaltax = salary * tax;
        double salaryaftertax = salary - totaltax;

        System.out.println(salaryaftertax);
}
}

