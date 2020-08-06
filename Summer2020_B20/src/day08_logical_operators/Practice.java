package day08_logical_operators;

public class Practice {
    public static void main(String[] args){
        // 18+ and US Citizen

        String firstName = "Phillip";
        String middleInitial = "J.";
        String lastName = "Fry";
        String fullName = firstName + " " + middleInitial + " " + lastName;
        int age = 2040;
        String citizenship = "USA";

        boolean voter = age >= 18 && citizenship == "USA";

        System.out.println(fullName + " is eligible to vote: " + voter);
    }
}
