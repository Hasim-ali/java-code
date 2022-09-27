public class FindSingleRep {
    public static void main(String[] args) {
        int[] arr={2,3,4,2,3,4,5,6,7,5,6,7,8};

        int rep=arr[0];
        for(int i=1;i<arr.length;i++){
            rep=rep^arr[i];
        }
        System.out.println("Single repearted no is: "+rep);
    }
}
