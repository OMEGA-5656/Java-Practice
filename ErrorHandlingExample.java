public class ErrorHandlingExample {
    public static void main(String args[]){
        try{
            int a=10;
            int b=0;
            if(b==0){
                throw new Throwable("Division by Zero not allowed");
            }
            System.out.println("result: "+a/b);
        }
        catch(Throwable t){
            System.out.println(t);
        }
    }
}
