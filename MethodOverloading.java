public class MethodOverloading {
    static void display(String s){
        System.out.println("display method which had string passed as an arguement, string: "+s);
    }
    static void display(){
        System.out.println("display method with no params");
    }
    public static void main(String args[]){
        System.out.println("Inside main.");
        display("xyz");
        display();
    }
}
