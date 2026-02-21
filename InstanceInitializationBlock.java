public class InstanceInitializationBlock {
    int runs;
    String Name;

    static{
        System.out.println("Inside Static Block");
    }

    {
        //IIB
        System.out.println("Inside IIB");
        Name = "xyz";
        runs = 182;
    }

    InstanceInitializationBlock(){
        System.out.println("Inside Constructor Block");
    }

    void display(){
        System.out.println("Inside display Method "+Name+" "+runs);
    }

    public static void main(String args[]){
        System.out.println("Inside Main Block");
        System.out.println("Creating 1st Object...");
        InstanceInitializationBlock ob = new InstanceInitializationBlock();
        System.out.println("1st Object created.");
        ob.display();
        System.out.println("Creating 2nd Object...");
        InstanceInitializationBlock ob2 = new InstanceInitializationBlock();
        System.out.println("2nd Object created.");
    }
}
