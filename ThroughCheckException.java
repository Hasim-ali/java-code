public class ThroughCheckException {
    static void checkage(int age){
        if(age>18){
            System.out.println("you are above 18 and allodew to vote");
        } else{
            throw new ArithmeticException("you are not allowed to vote");
        }
    }
    public static void main(String[] args) {
        try{
            checkage(12);
        }
        catch(Exception e){
            System.out.println("Inside catch block");
            System.out.println(e);
        }
    }
}
