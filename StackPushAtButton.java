import java.util.*;
public class StackPushAtButton {
    public static void PushAtButton(int data,Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        PushAtButton(data, s);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        PushAtButton(4, s);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
