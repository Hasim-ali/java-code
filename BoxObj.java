import java.util.Scanner;

class box{
    public double l;
    public double b;
    public double h;
    public double volume(double l,double b,double h){
        return (double)l*b*h;
    }
}

public class BoxObj {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        box b=new box();
        System.out.println("Enter the length breadth hight of the object: ");
        b.l=sc.nextDouble();
        b.b=sc.nextDouble();
        b.h=sc.nextDouble();
        
        System.out.println(b.volume(b.l, b.b, b.h));
    }
}
