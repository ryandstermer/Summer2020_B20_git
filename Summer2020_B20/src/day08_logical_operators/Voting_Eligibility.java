package day08_logical_operators;

public class Voting_Eligibility {
    public static void main(String[] args){

        String firstName = "Philip";
        String middleInitial = "J.";
        String lastName = "Fry";
        String fullName = firstName + " " + middleInitial + " " + lastName;

        int age = 2040;

        String citizenship = "USA";
        String citizenship1 = "New New York";
        String citizenship2 = "Earth";

        boolean req1 = age >= 18;
        boolean req2 = citizenship == "USA" || citizenship1 == "USA" || citizenship2 == "USA";
        boolean vote = req1 && req2;

        System.out.println(fullName + " is eligible to vote: " + vote);
    }
}
