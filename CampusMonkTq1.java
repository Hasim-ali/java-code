public class CampusMonkTq1 {
    public static void main(String[] args) {
        String BarCode="12ab*";
        int Digit;
        int AsciiValue;
        int Price=0;
        int Max;

        for(int i=0;i<BarCode.length();i++){
                Max=0;
            if(BarCode.charAt(i)>='0' && BarCode.charAt(i)<='9' ){
                Price+=BarCode.charAt(i)-48;
            } else {
                AsciiValue=BarCode.charAt(i);
                while(AsciiValue!=0){
                    Digit=AsciiValue%10;
                    if(Digit>=Max){
                        Max=Digit;
                    }
                    AsciiValue/=10;
                }
                Price+=Max;
            }
        }
        System.out.println(Price);
    }
}
