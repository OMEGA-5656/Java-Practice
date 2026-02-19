import java.util.*;
public class SwitchExample {
    public static void main(String args[]){
        String choice = "";
        while(!choice.equals("0")){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 0 to exit or 'V','I','B','G','Y','O','R': ");
            choice = sc.nextLine();
            switch(choice){
                case("V"):
                    System.out.println("Violet");
                    break;
                case("I"):
                    System.out.println("Indigo");
                    break;
                case("B"):
                    System.out.println("Blue");
                    break;
                case("G"):
                    System.out.println("Green");
                    break;
                case("Y"):
                    System.out.println("Yellow");
                    break;
                case("O"):
                    System.out.println("Orange");
                    break;
                case("R"):
                    System.out.println("Red");
                    break;
            }
        }
    }
}
