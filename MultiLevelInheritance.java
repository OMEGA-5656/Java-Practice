class GrandParent{
    static void grandParentDisplay(){
        System.out.println("Inside the inherited grand parent display method.");
    }
}

class Parent extends GrandParent{
    static void parentDisplay(){
        System.out.println("Inside the inherited parent display method.");
    }
}

public class MultiLevelInheritance extends Parent{
    public static void main(String[] args){
        System.out.println("Inside child class.");
        parentDisplay();
        grandParentDisplay();
    }
}
