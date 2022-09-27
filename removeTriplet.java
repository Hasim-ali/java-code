import java.util.*;

public class removeTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < size; i++){
            int num = in.nextInt();
            list.add(num);
        }
        int count = 0;
        for(int i = list.size() - 1; i >= 0; i--){
            int index = 0;
            count = 0;
            for(int j = list.size() - 1; j >= 0; j--){
                if(list.get(j).equals(list.get(i))){
                    if(count == 1){
                        index = j;
                    }
                    count++;
                }
                if(count == 3){
                    list.remove(i);
                    list.remove(index);
                    list.remove(j);
                    break;
                }
            }
        }
        System.out.println(list);

    }
}
