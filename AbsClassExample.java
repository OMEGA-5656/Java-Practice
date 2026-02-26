
abstract class Hero{
    private String name;
    public Hero(String name){
        this.name=name;
    }
    abstract void power();
    public String getName(){
        return this.name;
    }
}
class WonderWoman extends Hero{
    public WonderWoman(String name){
        super(name);
    }
    void power(){
        System.out.println("Power : woman");
    }
}

public class AbsClassExample {
    public static void main(String args[]){
        WonderWoman ww = new WonderWoman("xyz");
        ww.power();
    }
}
