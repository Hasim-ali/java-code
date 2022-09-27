public class Big_OH_question {
  public static void main(String[] args) {
    int arr[] = { 3, 4, 10 };
    int arr2[] = { 1, 4, 8 };

    int target = 5;
    int flag=0;

    task: for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr2.length; j++) {
        if (arr2[j] - arr[i] == target) {
          flag=1;
          System.out.println("[" + i + "," + j + "]");
          break task;
        }
      }

    }
    if(flag==0){
      System.out.println("["+-1+","+-1+"]");
    }
  }

}
