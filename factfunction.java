import java.util.*;
public class factfunction {
    public static void factorial(int a){
        if(a<0){
            System.out.println("InvalidNumber");
            return;
        }
        int fact=1;
        for(int i=a;i>=1;i--){
            fact=fact*i;
        }
        System.out.println(fact);
        return;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        factorial(num);
    }
}
