import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class ArrayLists{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println("Enter the range of the list");
        int range=sc.nextInt();

        //add element
                // list.add(0);
                // list.add(3);
                // list.add(4);
                // list.add(5);

        for(int i=0;i<range;i++){
            list.add(sc.nextInt());
        }

        System.out.println(list);

        //get element
        int element=list.get(2);
        System.out.println(element);


        //add element in middle
        list.add(1,2);
        System.out.println(list);

        //set element
        list.set(0,1);
        System.out.println(list);

        //delete element
        list.remove(3);
        System.out.println(list);

        //size of the list
        int size=list.size();
        System.out.println(size);

        //loops in list
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }

        //sort
        Collections.sort(list);
        System.out.println(list);
    }
}