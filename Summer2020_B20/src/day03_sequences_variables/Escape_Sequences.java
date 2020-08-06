package day03_sequences_variables;

public class Escape_Sequences {
    public static void main(String[] args) {
        System.out.println("Hello everyone, \nmy name is Cybertek");
        System.out.println("\tI am in Virginia\n");
        System.out.println("\n\n\t\t\tI love programming");

        System.out.println("\\"); //this will print one back slash
        System.out.println("/");  //this will print one forward slash

        System.out.println("\\\\"); //this will print two back slashes
        System.out.println("//");   //this will print two forward slashes

        System.out.println("My name is \'Ryan\'");
        System.out.println("My name is 'Ryan'");

        System.out.println("My favorite TV-series: \"The Office\"");
    }
}
