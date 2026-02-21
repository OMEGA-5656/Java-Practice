class Parent3{
    void display(){
        System.out.println("Inside the parent class display method.");
    }
}
public class MethodOverriding extends Parent3{
    @Override
    void display(){
        System.out.println("Inside the overridden method.");
        super.display();
    }

    public static void main(String args[]){
        System.out.println("Inside main.");
        MethodOverriding ob = new MethodOverriding();
        ob.display();
    }
}
