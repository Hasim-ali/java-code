public class AlohaQue {
    public static void main(String[] args) {
        int rem,rev=0,k,i;
        for(i=1;i<=50;i++){
            k=i;
            int a=(int)Math.log10(i)+1;
            while(k>0){
                rem=k%10;
                rev=rev+(int)Math.pow(rem, a);
                //System.out.println(rev);
                k=k/10;
            }
            if(i==rev){
                System.out.println(i);
            }
            rev=0;
        }
    }
}
