import java.util.*;
public class armstrongno {
    public static void main(String[] hasim){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your number");
        int num=sc.nextInt();
        int org=num,rem=0,rev;
        int a=(int)Math.log10(num)+1;

        while(num>0){
            rev=num%10;
            rem=rem+(int)Math.pow(rev,a);
            num=num/10;
        }
        if(org==rem){
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not armstrong number");
        }
    }
}
