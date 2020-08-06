package day38_Java_Recap;
import java.util.ArrayList;
import java.util.Arrays;
public class Grade_Report {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(100,90,85,75,55,45,73,73,37,47,60,87,77,67,57,47,93,83,73,63,53,43));

        System.out.println("All Grades: " + list);

        ArrayList<Integer> gradeA = new ArrayList<>();
        gradeA.addAll(list);
        gradeA.removeIf(each -> each < 90);
        System.out.println("Grade A: " + gradeA);

        ArrayList<Integer> gradeB = new ArrayList<>();
        gradeB.addAll(list);
        gradeB.removeIf(each -> each < 80 || each >= 90);
        System.out.println("Grade B: " + gradeB);

        ArrayList<Integer> gradeC = new ArrayList<>();
        gradeC.addAll(list);
        gradeC.removeIf(each -> each < 70 || each >= 80);
        System.out.println("Grade C: " + gradeC);

        ArrayList<Integer> gradeD = new ArrayList<>();
        gradeD.addAll(list);
        gradeD.removeIf(each -> each < 60 || each >= 70);
        System.out.println("Grade D: " + gradeD);

        ArrayList<Integer> gradeF = new ArrayList<>();
        gradeF.addAll(list);
        gradeF.removeIf(each -> each >= 60);
        System.out.println("Grade F: " + gradeF);

        System.out.println(" ");

        System.out.println("Students with A: " + gradeA.size());
        System.out.println("Students with B: " + gradeB.size());
        System.out.println("Students with C: " + gradeC.size());
        System.out.println("Students with D: " + gradeD.size());
        System.out.println("Students with F: " + gradeF.size());

    }
}
