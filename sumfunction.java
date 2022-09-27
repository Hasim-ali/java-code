import java.util.*;
public class sumfunction {
    public static int sum(int a,int b){
        int sum=a+b;
        return sum;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a=sc.nextInt();
        System.out.print("Enter second number: ");
        int b=sc.nextInt();

        int sum = sum(a,b);
        System.out.println(sum);
    }
    
}
