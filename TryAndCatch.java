public class TryAndCatch {
    public static void main(String[] args) {
        int x[]={5,7,9};
        try{
            System.out.println("The value of 3rd element is: "+x[2]);
            System.out.println("no run time error");
        }
        catch(Exception e){
            System.out.println("now catch an exception inside the cath block");
        }
        finally{
            System.out.println("inside finally");
            for(int i=0;i<3;i++){
                System.out.println(x[i]);
            }
        }
    }
}
