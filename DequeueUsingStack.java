package QUEUE;

import java.util.*;

public class DequeueUsingStack {
    public static class Stack{
        Deque<Integer>de=new LinkedList<>();
        public void add(int data){
            de.addLast(data);
        }public void remove(){
            System.out.println(de.removeLast());
        }public void peek(){
            System.out.println(de.getLast());
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.add(1);
        s.add(2);
        s.add(3);
        s.peek();
        s.remove();
        s.peek();
        //System.out.println(s.remove());
        
    }
}
