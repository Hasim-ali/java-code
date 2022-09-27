/*public class CreateThread extends Thread{
    public void run(){
        System.out.println("Thread created");
    }
    public static void main(String[] args) {
        CreateThread t=new CreateThread();
        t.start();
    }
}*/
public class CreateThread implements Runnable{
    public void run(){
        System.out.println("Thread created");
    }
    public static void main(String[] args) {
        CreateThread t=new CreateThread();
        Thread th=new Thread(t);
        th.start();
    }
}