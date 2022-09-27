import java.util.*;
public class updatebitoperation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the update bit: ");
        int setbit=sc.nextInt();

        int n=5;
        int pos=1;
        int bitmask=1<<pos;

        if(setbit==1){
            int newnumber= bitmask | n;
            System.out.println(newnumber);
        } else{
            int notbitmask=~(bitmask);
            int newnumber=notbitmask & n;
            System.out.println(newnumber);
        }
        

    }
}
