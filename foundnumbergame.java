import java.util.*;
public class foundnumbergame {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=(int)(Math.random()*100);
        while(a>0){
            System.out.print("Gusse the number: ");
            int x=sc.nextInt();
            if(a<x){
                System.out.println("Too big");
            }
            else if(a>x){
                System.out.println("Too small");
            }
            else{
                System.out.print("Congralation you find the number "+x);
                break;
            }
        }
    }
}
