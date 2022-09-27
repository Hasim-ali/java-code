import java.util.*;
public class leafyear {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%4==0||num%400==0){
            System.out.println("leaf year");
        }
        else{
            System.out.println("not leaf year");
        }
    }
    
}
