public class ArrayDeleteElement {
    public static void main(String[] args) {
        int[] a={10,20,30,40,50,60,70,80,90};
        int deleteElement=40;

        for(int i=0;i<=a.length;i++){
            if(a[i]==deleteElement){
                for(int j=i;j<a.length-1;j++){
                    a[j]=a[j+1];
                }
                break;
            }
        }

        for(int i=0;i<a.length-1;i++){
            System.out.print(a[i]+"  ");
        }
    } 
}