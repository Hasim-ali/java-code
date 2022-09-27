public class reccheckarraysort {
    public static boolean check(int arr[],int ind){
        if(ind==arr.length-1){
            return true;
        }
        if(arr[ind]<arr[ind+1]){
            return check(arr, ind+1);
        } else {
            return false;
        }
    }

    public static void main(String[] args){
        int arr[]={1,3,4,6};
       System.out.println(check(arr, 0));
    }
}