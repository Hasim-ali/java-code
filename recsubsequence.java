public class recsubsequence {
    public static void subsequence(String str,int ind,String newString){
        if(ind==str.length()){
            System.out.println(newString);
            return;
        }

        char current=str.charAt(ind);

        //to be 
        subsequence(str, ind+1, newString+current);
        // not to be
        subsequence(str, ind+1, newString);
    }

    public static void main(String[] args){
        String str="abc";
        subsequence(str, 0, "");
    }
}
