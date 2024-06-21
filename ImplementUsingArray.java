package QUEUE;

public class ImplementUsingArray {
    public static class Queue {
        int[] arr;
        int front, rear;
        int size;

        Queue(int size) {
            arr = new int[size];
            front = -1;
            rear = -1;
            this.size = size;
        }

        public boolean isEmpty() {
            return front == -1;
        }

        public boolean isFull() {
            return rear == size - 1;
        }

        public void add(int data) {
            if (isFull()) {
                System.out.println("full");
                return;
            }
            if (isEmpty()) {
                front++;
                arr[front] = data;
                rear++;
            }else{
                rear++;
            arr[rear] = data;
            }
        }

        public void remove() {
            if (isEmpty()) {
                System.out.println("empty");
                return;
            }front++;
            if(front>rear){
                front=rear=-1;
            }
        }public void start(){
            if (isEmpty()) {
                System.out.println("empty");
                return;
            }
            System.out.println(arr[front]);
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
        q.start();
        System.out.println(q.size);
    }
}
