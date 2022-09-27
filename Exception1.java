public class Exception1 {
    public static void main(String[] args) {
        try{
            int a=50,b=0,c;
            c=a/b;
            System.out.println(c);
        }
        // catch(ArithmeticException e){
        //     System.out.println("hello");
        // }
        catch(Exception e){
            System.out.println("exception occur");
            //print all 3 object
            e.printStackTrace();

            //print only exception name and description 
            System.out.println(e.toString());
            System.out.println(e);

            // only print exception and stack treace
            System.out.println(e.getMessage());
        }
        finally{
            int y=50,b=5;
            System.out.println(y/b);
        }
    }
}
