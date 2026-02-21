public class ConstructorExample {
    public int x;
    ConstructorExample(){
        System.out.println("Constructor Called.");
        this.x = x;
    }

    void Example(int a){
        System.out.println(a);
    }

    public static void main(String args[]){
        ConstructorExample ob = new ConstructorExample();
        ob.Example(19);
    }
}
