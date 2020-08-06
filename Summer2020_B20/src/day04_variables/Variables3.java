package day04_variables;

public class Variables3 {
    public static void main(String[] args) {
        String schoolName = "Cybertek School";

        String employeeName = "Vince Noir"; //"Employee Name: " + employeeName
        int employeeID = 1;
        String jobTitle = "Shop Manager";
        double salary = 50_000.01;
        char gender = '?';
        boolean isFullTime = 10>1;

        System.out.println("Emplopyee Name: " + employeeName);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: $" + salary);
        System.out.println("Gender: " + gender);
        System.out.println("Full Time: " + isFullTime);
    }
}
