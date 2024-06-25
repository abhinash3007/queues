package QUEUE;

public class ImplementationUsingCircularQueue {
    public static class Queue{
        int[]arr;
        int size;
        int front,rear;
        Queue(int size){
            arr=new int[size];
            front=-1;
            rear=-1;
            this.size=size;
        }public boolean isFull(){
            return (rear+1)%size==front;
        }public boolean isEmpty(){
            return front==-1;
        }
        public void add(int data){
            if(isFull()){
                System.out.println("full");
                return;
            }
            if(isEmpty()){
                front=rear=0;
                //arr[0]=data;
            }else{
                rear=(rear+1)%size;
            }
            arr[rear]=data;
        }public void remove(){
            if(isEmpty()){
                System.out.println("empty");
                return;
            }if(front>rear){
                front=rear=-1;
            }System.out.println(arr[front]);
            front=(front+1)%size;
        }public void start(){
            if(isEmpty()){
                System.out.println("empty");
                return;
            }System.out.println(arr[front]);
        }
    }public static void main(String[] args) {
        Queue q=new Queue(6);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.remove();
        q.remove();
        q.remove();
        q.add(7);

    }
}
