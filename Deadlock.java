class A{}
class B{}
public class Deadlock {
    static A a = new A();
    static B b = new B();
    public static void main(String args[]){
        Thread t1 = new Thread(()->{
            synchronized (a){
                System.out.println("Thread 1 locked ObjA");
                try{
                    Thread.sleep(10000);
                }
                catch(Exception e){}
                System.out.println("Thread 1 waiting for ObjB");
                synchronized (b){
                    System.out.println("Thread 1 locked objB");
                }
            }
        });
        Thread t2 = new Thread(()->{
            System.out.println("Thread 2 locked ObjB");
            try{
                Thread.sleep(10000);
            }
            catch(Exception e ){}
            System.out.println("Thread 2 waiting for ObjA");
            synchronized (a){
                System.out.println("Thread 2 locked objA");
            }
        });
        t1.start();
        t2.start();
    }
}
