//Day 4 first lecture
import java.util.*;
public class SetterGetterExample {
    String name;
    String power;
    void setName(String name){
        this.name = name;
    }
    void setPower(String power){
        this.power = power;
    }
    String getName(){
        return name;
    }
    String getPower(){
        return power;
    }
    public static void main(String args[]){
        //Using the Setter
        System.out.println("Enter the Name: ");
        Scanner sc = new Scanner(System.in);
        SetterGetterExample ob = new SetterGetterExample();
        ob.setName(sc.nextLine());
        System.out.println("Enter the Super Power: ");
        ob.setPower(sc.nextLine());

        //Using the getter
        System.out.println("Name: "+ob.getName());
        System.out.println("Super Power: "+ob.getPower());
    }
}
