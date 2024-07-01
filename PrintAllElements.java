package QUEUE;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PrintAllElements {
    public static void main(String[] args) {

        //brute
        // Queue<Integer>q=new LinkedList<>();
        // ArrayList<Integer>list=new ArrayList<>();
        // q.add(1);
        // q.add(2);
        // q.add(3);
        // q.add(4);
        // while (!q.isEmpty()) {
        //     list.add(q.remove());
        // }System.out.println(list);
        // for(int i=0;i<list.size();i++){
        //     q.add(list.remove(i));
        // }System.out.println(list);
        // System.out.println(q.size());

        //optimal
        Queue<Integer>q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        int n=q.size();
        System.out.println(n);
        while (n!=0) {
            int el=q.remove();
            q.add(el);
            n--;
        }System.out.println(q);
    }
}
