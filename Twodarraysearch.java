import java.util.*;

public class Twodarraysearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your row: ");
        int row = sc.nextInt();
        System.out.print("Enter your colomn: ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];
        System.out.println("Enter the number you want to find: ");
        int x = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (x == arr[i][j]) {
                    System.out.println("you find the number at " + i+" "+ + j);
                }
            }
            System.out.println();
        }
    }
}