package day17_string_review;

public class String_Methods2 {
    public static void main(String[] args){
        String s1 = "Cat";
        String s2 = new String("Cat");
        String s3 = new String("Cat");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println(s2 == s3);
        System.out.println(s2.equals(s3));

        String s4 = "java";
        String s5 = "Java";

        System.out.println(s4.equals(s5));
        System.out.println(s4 == s5);
        System.out.println(s4.equalsIgnoreCase(s5));

        String str = "   ";
        System.out.println(str.isEmpty());

        str = str.trim();
        System.out.println(str.isEmpty());
    }
}
