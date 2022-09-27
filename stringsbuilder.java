import java.util.*;

public class stringsbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hasim");
        // System.out.println(sb);

        // // char at index 0;
        // System.out.println(sb.charAt(0));

        // //set char at index 0;
        // sb.setCharAt(0, 'K');
        // System.out.println(sb);

        // //insert element in the string at index 2
        // sb.insert(5, 'a');
        // System.out.println(sb);

        // //delete the extra 'a'
        // sb.delete(5, 6);
        // System.out.println(sb);

        // //add an element 
        // sb.append("a");
        // sb.append("l");
        // sb.append("i");
        // System.out.println(sb);
        // System.out.println(sb.length());

        //System.out.println(sb+" ali");

        System.out.println(sb.substring(1,3));
    }
}
