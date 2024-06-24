package QUEUE;

public class ImplementDequeueUsingArray {
    public static class Dequeue{
        int[]arr;
        int size;
        int data;
        int front,rear;
        Dequeue(int size){
            arr=new int[size];
            this.size=size;
            this.data=data;
            front=rear=-1;
        }public boolean isEmpty(){
            return front==-1;
        }public boolean isFull(){
            return (rear+1)%arr.length==front;
        }public void addFront(int data){
            if(isFull()){
                System.out.println("full");
                return;
            }else if(isEmpty()){
                front=rear=0;
                arr[front]=data;
            }else{
                front=(front-1+arr.length)%arr.length;
                arr[front]=data;
            }
        }public void addBack(int data){
            if(isFull()){
                System.out.println("full");
                return;
            }else if(isEmpty()){
                front=rear=0;
                arr[rear]=data;
            }else{
                rear=(rear+1)%arr.length;
                arr[rear]=data;
            }
        }public void removrFront(){
            if(isEmpty()){
                System.out.println("empty");
                return;
            }if(front==rear){
                front=rear=-1;
            }else{
                front=(front+1)%arr.length;
            }
        }public void removrBack(){
            if(isEmpty()){
                System.out.println("empty");
                return;
            }if(front==rear){
                front=rear=-1;
            }else{
                rear=(rear-1+arr.length)%arr.length;
            }
        }public void front(){
            if(isEmpty()){
                System.out.println("empty");
                return;
            }System.out.println(arr[front]);
        }public void back(){
            if(isEmpty()){
                System.out.println("empty");
                return;
            }System.out.println(arr[rear]);
        }
    }public static void main(String[] args) {
        Dequeue de=new Dequeue(6);
        de.addFront(1);
        de.addBack(2);
        de.addFront(3);
        de.addBack(4);
        de.addFront(5);
        de.addBack(6);
        System.out.println(de+" ");
        de.removrBack();
        de.back();
        de.removrFront();
        de.front();
        de.removrBack();
        de.back();
        de.removrFront();
        de.front();
    }
}
