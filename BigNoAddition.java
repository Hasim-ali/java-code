import java.util.*;

public class BigNoAddition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the string");
        String str=sc.nextLine();

        String[] string=str.split(",");
        int[] arr=new int[str.length()];
        int sum=0;

        for(int i=0;i<string.length;i++){
            arr[i]= Integer.valueOf(string[i]);
        }

        for(int i=0;i<string.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);

        
    }

    
}
