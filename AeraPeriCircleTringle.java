import java.util.Scanner;
public class AeraPeriCircleTringle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radious of the circle: ");
        int radious=sc.nextInt();

        System.out.println("The aera of the circle is "+3.14*radious*radious);
        System.out.println("The perimeter of the circle is "+2*3.14*radious);

        System.out.println("enter the length breadth and hight of the triangel: ");

        int length=sc.nextInt();
        int breadth=sc.nextInt();
        int hight=sc.nextInt();

        System.out.println("The perimeter of the triangel is "+(length+breadth+hight));
        double s=(double)(length+breadth+hight)/2;
        System.out.println("The area of the triangel is "+(double)Math.sqrt((s*(s-length)*(s-breadth)*(s-hight))));
    }
}
