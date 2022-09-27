import java.util.*;
public class fibofunction {
    public static int fibo(int a){
        if(a==0)
        return 0;
        if(a==1)
        return 1;
        return fibo(a-1)+fibo(a-2);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your range: ");
        int num=sc.nextInt();
        int i;

        for(i=1;i<=num;i++){
            System.out.println(fibo(i)+" ");
        }
    }
}
