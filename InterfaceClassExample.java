interface Human{
    void power();
    default void indentity(){
        System.out.println("xyz");
    }
}

class Shaktimaan implements Human{
    public void power(){
        System.out.println("power of 5 elements.");
    }
}

public class InterfaceClassExample {
    public static void main(String args[]){
        Shaktimaan ob = new Shaktimaan();
        ob.power();
    }
}
