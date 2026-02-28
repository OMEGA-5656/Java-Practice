class MyThread1 extends Thread{
    public void run(){
        try{
            System.out.println("Sleeping....");
            Thread.sleep(10000);
            System.out.println("Woke up!");
        }
        catch(Exception e){}
    }
}
public class Sleeping {
    public static void main(String args[]){
        MyThread1 t1 = new MyThread1();
        t1.start();
    }
}
