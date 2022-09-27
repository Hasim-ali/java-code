public class getbitoperation {
    public static void main(String[] args){
        int num=5;
        int pos=2;
        int bitmask=1<<pos;

        if((bitmask & num)==0){
            System.out.println("bit was zero");
        } else{
            System.out.println("bit was one");
        }
    }
}
