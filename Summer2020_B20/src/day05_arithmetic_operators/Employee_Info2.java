package day05_arithmetic_operators;

public class Employee_Info2 {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Daniel";
        String gender = "Male";
        int age = 35;
        String companyName = "CapitalOne";
        String jobTitle = "SDET";
        boolean isFullTime = true;
        boolean isMarried = false;
        double salary = 120000.50;

        String fullName = firstName + " " + lastName;

        System.out.println("Employee's full name is: " + fullName);
        System.out.println(fullName + "'s gender is: " + gender);
        System.out.println(fullName + "'s age is: " + age + " years old");
        System.out.println(fullName + " works at: " + companyName);
        System.out.println(fullName + "'s Job title is: " + jobTitle);
        System.out.println(fullName + "'s salary is " + "$" + salary);
        System.out.println(fullName + " is full time employee: " + isFullTime);
        System.out.println(fullName + " is married: " + isMarried);
    }
}

