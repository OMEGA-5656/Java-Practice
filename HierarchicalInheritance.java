class ParentX{
    static void parentDisplay(){
        System.out.println("Inside parent.");
    }
}

class Child1 extends ParentX{
    Child1(){
        System.out.println("Inside child 1.");
        parentDisplay();
    }
}
class Child2 extends ParentX{
    Child2(){
        System.out.println("Inside child 2.");
        parentDisplay();
    }
}

public class HierarchicalInheritance {
        public static void main(String args[]){
            Child1 ob1 = new Child1();
            Child2 ob2 = new Child2();

        }
}
