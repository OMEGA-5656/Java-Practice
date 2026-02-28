public class ThrowInBlock {
    public static void main(String args[]){
        try{
            System.out.println("Inside try Block");
            throw new ArithmeticException("Exception from try.");
        }
        catch(ArithmeticException e){
            System.out.println("Error in catch block: "+e.getMessage());
            throw new NullPointerException("Exception in catch");
        }
        finally{
            System.out.println("Inside finally block");
            throw new IllegalStateException("Exception in finally block");
        }
    }
}
