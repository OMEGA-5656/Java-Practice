class MyThread extends Thread{
    public void run(){
        System.out.println("Thread Running");
    }
}
public class NewState {
    public static void main(String args[]){
        MyThread t1 = new MyThread();
        t1.start();//creates a new thread
        //t1.run(); runs normally.
        System.out.println("State: "+t1.getState());
    }
}
