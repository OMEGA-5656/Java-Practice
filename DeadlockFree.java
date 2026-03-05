class A1{}
class B1{}

public class DeadlockFree {
    static A1 objA = new A1();
    static B1 objB = new B1();

    public static void main(String args[]) {
        Thread t1 = new Thread(() -> {
            synchronized (objA) {
                synchronized (objB) {
                    System.out.println("Thread 1 finished safely.");
                }
            }
        });
        Thread t2 = new Thread(()->{
            synchronized (objB){
                synchronized (objA){
                    System.out.println("Thread 2 finished safely");
                }
            }
        });
        t1.start();
        t2.start();
    }
}
