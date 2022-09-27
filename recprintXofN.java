public class recprintXofN {
    public static int calcPower(int a,int n){
       if(n==0){
        return 1;
       }
       if(a==0){
        return 0;
       }

       // stack hight is n
       
        // int result=calcPower(a,n-1);
        // int out=a*result;
        // return out;
       

       // stack hight for logn

       if(n%2==0){
        return calcPower(a,n/2)*calcPower(a,n/2);
       }
       else{
        return calcPower(a,n/2)*calcPower(a,n/2)*a;
       }
    }

    public static void main(String[] args){
        int x=2,n=5;
        int output=calcPower(x,n);
        System.out.println(output);
    }

    
}
