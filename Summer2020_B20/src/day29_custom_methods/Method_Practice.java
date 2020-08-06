package day29_custom_methods;

public class Method_Practice {
    public static void main(String[] args) {

        System.out.println("Odd numbers:");
        oddNumbers();
        System.out.println("Even numbers:");
        evenNumbers();
    }
        public static void oddNumbers(){
            for (int i = 1; i <= 100; i++) {
                if (i % 2 == 0) {
                    continue;
                } else {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
        public static void evenNumbers(){
            for(int i = 1; i <= 100; i++){
                if(i %2 == 0){
                    System.out.print(i + " ");
                }
            }
        System.out.println();
    }
}