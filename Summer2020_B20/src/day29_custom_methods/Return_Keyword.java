package day29_custom_methods;
import java.util.Scanner;
public class Return_Keyword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score");
        int score = input.nextInt();
        grading(score);
    }

    public static void grading(int score) {
        if (score < 0 || score > 100) {
            System.out.println("Invalid score!");
            return;
        } else {
            char grade = (score >= 90) ? 'A' : (score >= 80) ? 'B' : (score >= 70) ? 'C' : (score >= 60) ? 'D' : 'F';
            System.out.println("Your grade is: " + grade);
        }
    }
}