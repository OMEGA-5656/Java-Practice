interface Parent1{
    public default void power(){
        System.out.println("this is from parent1");
    }
}

interface Parent2{
    public default void disp(){
        System.out.println("this is from Parent2");
    }
}
public class MultipleInheritance implements Parent1,Parent2{
    public static void main(String args[]){
        System.out.println("this is inside main");
        MultipleInheritance ob = new MultipleInheritance();
        ob.disp();
        ob.power();
    }
}
