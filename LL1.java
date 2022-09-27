import java.util.LinkedList;

public class LL1 {
    public static void main(String[] args) {
        LinkedList<String> List=new LinkedList<String>();

        List.addFirst("a");
        List.addFirst("is");
        System.out.println(List);

        List.addFirst("this");
        List.add("List");
        System.out.println(List);
        System.out.println(List.size());

        for(int i=0;i<List.size();i++){
            System.out.print(List.get(i)+" -> ");
        }
        System.out.println("null");

        List.removeLast();

        List.remove(1);
        System.out.println(List);


    }
}
