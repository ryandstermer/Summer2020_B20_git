package day16_string;

public class String_Methods {
    public static void main(String[] args){
        String email = "cybertek@gmail.com";

        email.replace("gmail", "yahoo");

        System.out.println(email);

        String word = "Java";
        word = word.replace("a", "e");
        System.out.println(word);

        String sentence = "I like to learn Java, Java is cool, Java is fun";
        sentence = sentence.replace("a, Java", "a, C#");
        sentence = sentence.replace("Java ", "Python ");
        System.out.println(sentence);

        String s1 = "I like to stay in Cybertek, Cybertek is a nice place";
        s1 = s1.replace("Cybertek", "MIT");
        System.out.println(s1);

        String s2 = "I like tea and tea";
        s2 = s2.replaceFirst("tea", "coffee");
        System.out.println(s2);

        String s3 = "I like to watch Game of Thrones and the Walking Dead";
        s3 = s3.replace(", and the Walking Dead", "");

        String s4 = "I like to stay in Cybertek, we are learning Java";
        int r1 = s4.indexOf("r");
        int r2 = s4.indexOf("re");
        int r3 = s4.indexOf("rn");

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        String str = "Java is a programming language, and Java is fun";
        int j1 = str.lastIndexOf("J");
        System.out.println(j1);
    }
}
