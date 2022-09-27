import java.util.*;
public class mulfunction {
    public static int mul(int a,int b){
        return a*b;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println("mul of two number is "+mul(a,b));
    }
}
