import java.util.Scanner;

public class StringChallenge {
  static int findrepeating(int arr[], int length) {
    for (int i = 0; i < length; i++) {
      if (arr[i] > 0) {
        for (int j = i + 1; j < length; j++) {
          if (arr[i] == arr[j] || arr[i] > arr[j]) {
            return i;
          }
        }
      }
    }
    return -1;
  }

  static public void main(String args[]) {
    Scanner s = new Scanner(System.in);
    // System.out.println("Enter String");
    String str = s.nextLine();
    String strArray[] = str.split("\\s+");
    // char c[]=str.toCharArray();
    int length = strArray.length;
    int arr[] = new int[length];
    // System.out.println(length);
    for (int i = 0; i < length; i++) {
      char parts[] = strArray[i].toCharArray();
      int count = 0;
      int l = parts.length;

      for (int j = 0; j < l; j++) {
        for (int k = j + 1; k < l; k++) {
          if (parts[j] == parts[k]) {
            count = count + 1;
          }
        }
      }
      arr[i] = count;
    }
    int arrayLength = arr.length;
    int n = findrepeating(arr, arrayLength);
    for (int i = 0; i < arrayLength; i++) {
      if (arr[i] > arr[n]) {
        n = i;
      }
    }
    if (n >= 0) {
      System.out.println(strArray[n]);
    } else {
      System.out.println(n);
    }
  }
}