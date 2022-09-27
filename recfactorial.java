public class recfactorial {
    public static int fact(int n){
        if(n==0||n==1){
            return 1;
        }
        int a=fact(n-1);
        int fac=n*a;
        return fac;
    }

    public static void main(String[] args){
        int n=5;
        int result=fact(n);
        System.out.println(result);
    }
}