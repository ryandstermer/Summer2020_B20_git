package day27_28_recap;

public class Email {
    public static void main(String[] args){
        String email = "cybertek@gmail.com";

        String name = email.substring(0,email.indexOf("@"));
        String domain = email.substring(email.indexOf("@")+1, email.indexOf("."));

        System.out.println(name);
        System.out.println(domain);
    }
}
