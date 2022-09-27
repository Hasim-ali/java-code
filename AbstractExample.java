abstract class AbstractExe {
   abstract void start();
}
class car extends AbstractExe{
    void start(){
        System.out.println("start with key");
    }
}
class AbstractExample extends AbstractExe{
    void start(){
        System.out.println("Start with kick");
    }
    public static void main(String[] args) {
        car c=new car();
        c.start();

        AbstractExample b=new AbstractExample();
        b.start();
    }
}