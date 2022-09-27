import java.util.Scanner;
public class fibonacciNo{
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      
      System.out.println("Enter the range: ");
      int range=sc.nextInt();
      int a=0,b=1,c;

      System.out.println(a);
      System.out.println(b);
      for(int i=1;i<=range;i++){
        c=a+b;
        System.out.println(c);
        a=b;
        b=c;
      }
    }
}