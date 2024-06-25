package QUEUE;

public class DequeueUsingLinkedList {
    public static class Node{
        int data; 
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            next=null;
            prev=null;
        }
    }public static Node head;
    public static Node tail;
    public static class Dequeue{
        public void addFront(int data){
            Node node=new Node(data);
            if(head==null){
                head=tail=node;
                return;
            }
            node.next=head;
            head.prev=node;
            head=node;
        }public void addBack(int data){
            Node node=new Node(data);
            if(head==null){
                head=tail=node;
                return;
            }
            tail.next=node;
            node.prev=tail;
            tail=node;
        }public void removeFront(){
            if(head==null){
                System.out.println("empty");
                return;
            }System.out.println(head.data);
            head=head.next;
            if(head!=null){
                head.prev=null;
            }else{
                tail=null;
            }
        }public void removeBack(){
            if(head==null){
                System.out.println("empty");
                return;
            }System.out.println(tail.data);
            tail=tail.prev;
            if(tail!=null){
                tail.next=null;
            }else{
                head=null;
            }
        }public void front(){
            if(head==null){
                System.out.println("empty");
                return;
            }System.out.println(head.data);
        }public void back(){
            if(head==null){
                System.out.println("empty");
                return;
            }System.out.println(tail.data);
        }
    }public static void main(String[] args) {
        Dequeue dq=new Dequeue();
        dq.addFront(1);
        dq.addBack(2);
        dq.addFront(3);
        dq.addBack(4);
        dq.addFront(5);
        dq.front();
        dq.back();
        dq.removeFront();
        dq.front();
        dq.removeBack();
        dq.back();
        dq.removeBack();
    }
}
