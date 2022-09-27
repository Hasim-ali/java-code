public class FindMissingNo {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6};

        int expnoele=arr.length+1;
        int totalsum=(expnoele*(expnoele+1))/2;

        int arrsum=0;
        for(int i=0;i<arr.length;i++){
            arrsum=arrsum+arr[i];
        }
        int missno=totalsum-arrsum;
        System.out.println(missno);
    }
}
