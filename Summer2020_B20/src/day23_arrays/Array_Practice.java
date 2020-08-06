package day23_arrays;

public class Array_Practice {
    public static void main(String[] args){
        String PC = "kVA";

        String[] characters = {"Tanglar", "Theory", "Arros", "Falkin", "CRPA"};

        String PC1 = characters[0];

        System.out.println(PC1 + " and friends!");
        System.out.println("=============================================");

        String[] names = {"Mike", "Adam", "Tonny", "John", "Amy"};
        int[] scores = {85, 70, 95, 90, 100};

        /*System.out.println(names[0] + " : " + scores[0]);
        System.out.println(names[1] + " : " + scores[1]);
        System.out.println(names[2] + " : " + scores[2]);
        System.out.println(names[3] + " : " + scores[3]);
        System.out.println(names[4] + " : " + scores[4]);*/

        for(int i = 0; i <=4; i++){
            System.out.println(names[i] + " : " + scores[i]);
        }
        System.out.println("==============================================");

        String[] classes = new String[4];
        classes[0] = "Barbarian";
        classes[2] = "Druid";
        classes[1] = "Artificer";
        classes[3] = "Rogue";

        for(int i = 0; i <= classes.length-1; i++){
            System.out.print(classes[i] + " ");
        }
    }
}
