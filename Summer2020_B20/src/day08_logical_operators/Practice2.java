package day08_logical_operators;

public class Practice2 {
    public static void main(String[] args){
        String firstName = "Conor";
        String lastName = "McNugget";
        int age = 18;
        String citizenship = "USA";
        String citizenship2 = "France";

        String fullName = firstName + " " + lastName;
        boolean citizen = citizenship == "USA" || citizenship2 == "USA";
        boolean oldEnough = age >= 18;

        boolean eligible = oldEnough && citizen;
        System.out.println(fullName+ " is eligible to vote for Trump: " + eligible);
    }
}
