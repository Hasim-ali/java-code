public class ArrayInsertAtPos {
    public static void main(String[] args) {
        int[] a={10,20,30,40,50,60,70,80};

        int pos=5;
        int element = 0;

        for(int i=a.length-1;i>pos-1;i--){
            a[i]=a[i-1];
        }
        a[pos-1]=element;
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
