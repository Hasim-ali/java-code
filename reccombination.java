public class reccombination {
    public static String[] kepad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printcom(String str,int ind,String combination){
        if(ind==str.length()){
            System.out.println(combination);
            return;
        }

        char current=str.charAt(ind);
        String mapping=kepad[current-'0'];

        for(int i=0;i<mapping.length();i++){
            printcom(str, ind+1, combination+mapping.charAt(i));
        }
    }

    public static void main(String[] args){
        String str="23";
        printcom(str, 0, "");
    }
    
}