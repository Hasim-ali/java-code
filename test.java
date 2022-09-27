public class test {
   
    public static void main(String[] args) {
        int num=10;
        printNo(num);
    }

    public static void printNo(int num){
        if(num==0){
            return;
        }
        System.out.println(num);
        printNo(num-1);
    }
}
