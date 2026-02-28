public class Finalize {
    protected void finalize(){
        System.out.println("Finalize called");
    }
    public static void main(String args[]){
        Finalize f = new Finalize();
        f = null;
        System.gc();
    }
}
