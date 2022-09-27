public class StringRiverse1 {
    public static void main(String[] args) {
        String str1="asd";
        String str2="";
        char ch;

        for(int i=str1.length()-1;i>=0;i--){
            ch=str1.charAt(i);
            str2=str2+ch;
        }

        System.out.println(str2);
    }
}
