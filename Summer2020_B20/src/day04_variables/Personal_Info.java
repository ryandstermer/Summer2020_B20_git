package day04_variables;

public class Personal_Info {
    public static void main(String[] args) {

        boolean dnd = true;

        String firstName = "Ryan";
        String lastName = "Stermer";
        int age = 27;
        String country = "United States of America";
        String ssn = "000-00-0000";
        char gender = 'M';
        boolean isEmployed = dnd;

        System.out.println("My first name is " + firstName);
        System.out.println("My last name is " + lastName);
        System.out.println("I am " + age + " years old");
        System.out.println("I am from the " + country);
        System.out.println("My Social Security Number is " + ssn);
        System.out.println("I am a " + gender);
        System.out.println("I am employed, " + isEmployed);

    }
}
