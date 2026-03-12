class Thread2 extends Thread{
    public void run() {
        System.out.println(getName() + "Started state " + getState());

        Thread.yield();
        try {
            Thread.sleep(12000);
        } catch (InterruptedException e) {
            System.out.println(getName() + "interrupted: "+e.getMessage());
        }
        System.out.println(getName()+" finished, state "+getState());
    }
}

public class ThreadMethods {
    public static void main(String args[]){
        Thread2 t1 = new Thread2();
        Thread2 t2 = new Thread2();
        System.out.println("Before start, t1 is alive or not "+t1.isAlive());

        t1.start();
        t2.start();

        System.out.println("After start t1 = "+t1.getState());
        System.out.println("After start t2 = "+t2.getState());

        try{
            t1.join();
            t2.join();
        }

        catch(InterruptedException e){
            System.out.println("Main thread interrupted: "+e.getMessage());
        }

        System.out.println("After Join T1 state = "+t1.getState());
        System.out.println("After Join T2 state = "+t2.getState());
        System.out.println("Check t1 is alive, "+t1.isAlive());
        System.out.println("Check t2 is alive, "+t2.isAlive());
    }
}
