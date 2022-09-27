interface a{
    void show();
}
interface b{
    void display();
}
public class InterfaceExample implements a,b{
    public void show(){
        System.out.println("1");
    }
    public void display(){
        System.out.println("2");
    }
    public static void main(String[] args) {
        InterfaceExample i=new InterfaceExample();
        i.show();
        i.display();
    }
}
