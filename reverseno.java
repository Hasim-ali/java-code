import java.util.*;
public class reverseno {
    public static void main(String[] hasim){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int rev,rem=0;

        while(num>0){
            rev=num%10;
            rem=rem*10+rev;
            num=num/10;
        }
        System.out.println(rem);
    }
}
