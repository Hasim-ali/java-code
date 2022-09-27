public class recrstringrev {
    public static void revstring(String str,int index){
        if(index==0){
            System.out.println(str.charAt(index));
            return;
        }

        System.out.print(str.charAt(index));
        revstring(str, index-1);
    }    

    public static void main(String[] args){
        String str="abcd";
        revstring(str, str.length()-1);
    }
}