import java.util.*;

public class FindDuplicate {
    /*public static void main(String[] args) {
        int[] a={2,3,6,5,49,6,3,2,5,36,2};
        Set<Integer> s=new HashSet<>();

        for(int no: a){
            if(s.add(no)==false){
                System.out.println(no);
            }
        }
    }*/

    public static void main(String[] args) {
        int[] a={2,3,6,5,49,6,3,2,5,36,2};
        Map<Integer,Integer> hm= new HashMap<>();

        for(int no: a){
            Integer count=hm.get(no);
            if(count==null){
                hm.put(no,1);
            } else {
                count++;
                hm.put(no, count);
            }
        }

        Set<Map.Entry<Integer,Integer>> es=hm.entrySet();

        for(Map.Entry<Integer,Integer> me: es){
            if(me.getValue()>1){
                System.out.println(me.getKey());
            }
        }
    }
}
