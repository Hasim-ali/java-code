public class recremovedupli {
    public static boolean[] map=new boolean[26];

    public static void remdup(String str,int ind,String newString){
        if(ind==str.length()){
            System.out.println(newString);
            return;
        }
        
        char current=str.charAt(ind);
        if(map[current-'a']){
            remdup(str, ind+1, newString);
        } else {
            newString+=current;
            map[current-'a']=true;
            remdup(str, ind+1, newString);
        }
    }

    public static void main(String[] args){
        String str="abbccda";
        remdup(str, 0, "");
    }
}
