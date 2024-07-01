package QUEUE;
import java.util.*;
public class ReverseKGroup {
    public static void reversek(Queue<Integer>q,int k){
        Stack<Integer>s=new Stack<>();
        for (int i=0;i<k;i++) {
            s.push(q.remove());
        }int m=q.size();
        while (!s.isEmpty()) {
            q.add(s.pop());
        }while (m!=0) {
            q.add(q.remove());
            m--;
        }
    }public static void main(String[] args) {
        Queue <Integer>q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        reversek(q, 3);
        System.out.println(q);
    }
}
