public class recpermutation {
    public static void printPermutation(String str,String Permutation){
        if(str.length()==0){
            System.out.println(Permutation);
            return;
        }

        for(int i=0;i<str.length();i++){
            char current=str.charAt(i);
            String newString=str.substring(0, i)+str.substring(i+1);
            printPermutation(newString, Permutation+current);
        }
    }

    public static void main(String[] args){
        String str="abc";
        printPermutation(str, "");
    }
}
