import java.util.*;
public class arraysearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter search element: ");
        int x=sc.nextInt();

        for(int j=0;j<5;j++){
           if(arr[j]==x){
            System.out.println("number found in index" +j);
           }
        }
    }
}
