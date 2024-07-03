package QUEUE;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static void reverse(Queue<Integer> q) {
        int size = q.size();
        int[]arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = q.remove();
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            q.add(arr[i]);
        }
    }public static void reverse2(Queue<Integer>q){
        Stack<Integer>s=new Stack<>();
        while (!q.isEmpty()) {
            s.push(q.remove());
        }while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        //reverse(q);
        reverse2(q);
        System.out.println(q);
    }
}
