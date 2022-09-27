import java.util.*;
public class twodarray1 {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter your row: ");
    int row=sc.nextInt();
    System.out.print("Enter your colomn: ");
    int col=sc.nextInt();

    int[][] arr=new int[row][col];

    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            arr[row][col]=sc.nextInt();
        }
    }

    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            System.out.print(arr[row][col]);
        }
        System.out.println();
    }
}
}
