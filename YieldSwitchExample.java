import java.util.*;
public class YieldSwitchExample {
    public static void main(String args[]){
        String choice = "";
        while(!choice.equals("0")){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 0 to exit or 'V','I','B','G','Y','O','R': ");
            choice = sc.nextLine();
            String color  = switch(choice){
                case("V") -> {yield "Violet";}
                case("I") -> {yield "Indigo";}
                case("B") -> {yield "Blue";}
                case("G") -> {yield "Green";}
                case("Y") -> {yield "Yellow";}
                case("O") -> {yield "Orange";}
                case("R") -> {yield "Red";}
                default -> {yield "Blank";}
            };
            System.out.println("Color is "+color);
        }
    }
}
