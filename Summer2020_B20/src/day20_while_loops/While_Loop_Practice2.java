package day20_while_loops;

public class While_Loop_Practice2 {
    public static void main(String[] args){
        int num = 10;
        while(num > 5){
            System.out.println("Java is easy!");
            num--;
        }

        String str = "Cybertek";
        String result = "";
        int index = str.length()  -1;
        while(index >= 0){
            result += str.charAt(index) + "";
            index--;
        }
        System.out.println(result);
    }
}
