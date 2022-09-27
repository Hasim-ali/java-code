//import java.util.Scanner;

public class ArraySecondLargest {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the element: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Second Largest element is"+arr[1]);

    }*/

    public static void main(String[] args) {
        int[] a={56,12,89,54,96,32,12};
        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;

        int s=Integer.MAX_VALUE;
        int b=Integer.MAX_VALUE;

        for(int i=0;i<a.length;i++){
            if(a[i]>largest){
                secondlargest=largest;
                largest=a[i];
            } else if(a[i]>secondlargest && a[i]!=largest){
                secondlargest=a[i];
            }
        }

        System.out.println("Second largest element in the array is "+secondlargest);

        for(int i=0;i<a.length;i++){
            if(a[i]<s){
                b=s;
                s=a[i];
            } else if(a[i]<b && a[i]!=s){
                b=a[i];
            }
        }
        System.out.println("Second smallest element in the array is "+b);


    }
}
