package QUEUE;

public class ImplementationUsingLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }public static Node head;
    public static Node tail;
    public static class Queue{
        Node front;
        Node rear;
        Queue(){
            front=rear=null;
        }public boolean isEmpty(){
            return front==null;
        }
        public void add(int data){
            if(isEmpty()){
                Node node=new Node(data);
                front=rear=node;
                return;
            }else{
                rear.next=new Node(data);
            rear=rear.next;
            }
        }public void remove(){
            if(isEmpty()){
                System.out.println("empty");
                return;
            }System.out.println(front.data);
            front=front.next;
        }public void peek(){
            if(isEmpty()){
                System.out.println("empty");
                return;
            }System.out.println(front.data);
        }
    }public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.remove();
    
    }
}
