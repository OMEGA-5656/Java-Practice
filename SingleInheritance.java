class ClassToBeInherited{
    static void display(){
        System.out.println("Inside the inherited display method.");
    }
}

public class SingleInheritance extends ClassToBeInherited{
    public static void main(String[] args){
        System.out.println("Inside child class.");
        display();
    }
}
