import java.util.Scanner;
public class AlohaQue2 {
    public static boolean isprime(int a){
        if(a<=1){
            return false;
        }
        for(int i=2;i<Math.sqrt(a);i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    public static int fibo(int a){
        if(a==0)
            return 0;
        if(a==1)
         return 1;

        return fibo(a-1)+fibo(a-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the range:");
        int range=sc.nextInt();

        for(int i=0;i<=range;i++){
            int fiboresult=fibo(i);
            if(isprime(fiboresult))
             System.out.println(fiboresult+ " prime");
            else
            System.out.println(fiboresult+ " not prime");

            //System.out.print(fiboresult);
           // System.out.println();
        }
    }
}