package day15_string;

public class String_Methods {
    public static void main(String[] args){
        String name = "Cybertek School";

        char ch1 = name.charAt(0);
        char ch2 = name.charAt(5);

        System.out.println(ch1 + " " + ch2);

        int l = name.length();
        System.out.println(l);

        int lastIndexNumber = l - 1;

        char last = name.charAt(lastIndexNumber);
        System.out.println(last);

        String schoolName = "Cybertek";
        schoolName = schoolName.concat(" School");

        System.out.println(schoolName);

        String name1 = "cybertek SCHOOL";
        System.out.println(name1);

        name1 = name1.toLowerCase();
        System.out.println(name1);

        name1 = name1.toUpperCase();
        System.out.println(name1);
    }
}
