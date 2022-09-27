import java.util.ArrayList;

public class PrintEvenOddUsingList {
    public static void main(String[] args) {
        int[] arr={12,24,65,35,93,65};
        int esum=0,osum=0;

        ArrayList<Integer> a1=new ArrayList<>();        
        ArrayList<Integer> a2=new ArrayList<>();        

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                a1.add(arr[i]);
            } else{
                a2.add(arr[i]);
            }
        }
        System.out.println("Even no is ");
        for(int no1:a1){
            System.out.println(no1+" ");
            esum=esum+no1;
        }
        System.out.println("Even no sum is "+esum);

        System.out.println("Odd number is ");
        for(int no2:a2){
            System.out.println(no2+" ");
            osum=osum+no2;
        }
        System.out.println("Odd sum is "+osum);
    }
}
