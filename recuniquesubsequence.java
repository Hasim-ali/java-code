import java.util.HashSet;
public class recuniquesubsequence {
    public static void sub(String str,int ind,String newString,HashSet<String>set){
        if(ind==str.length()){
            if(set.contains(newString)){
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
            }
        }

        char current=str.charAt(ind);

        //to be 
        sub(str, ind+1, newString+current,set);
        // not to be
        sub(str, ind+1, newString,set);
    }

    public static void main(String[] args){
        String str="aaa";
        HashSet<String> set =new HashSet<>();
        sub(str, 0, "", set);
    }
}
