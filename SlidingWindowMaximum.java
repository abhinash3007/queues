package QUEUE;

import java.util.*;

public class SlidingWindowMaximum {
    public static void maximum(int[]arr,int k){
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<=arr.length-k;i++){
            int max=Integer.MIN_VALUE;
            for(int j=i;j<i+k;j++){
                if(arr[j]>max){
                    max=arr[j];
                }
            }list.add(max);
            System.out.println(max);
        }
    }public static void better(int[]arr,int k){
        Deque<Integer>q=new LinkedList<>();
        for(int i=0;i<k;i++){
            while (!q.isEmpty() && arr[i]>=arr[q.peekLast()]) {
                q.removeLast();
            }q.addLast(i);
        }for(int i=k;i<arr.length;i++){
            while (!q.isEmpty() && arr[i]>=arr[q.peekLast()]) {
                q.removeLast();
            }while (!q.isEmpty() && q.peekFirst()>i-k) {
                q.removeFirst(); 
            }q.addLast(i);
        }
    }
    public static void main(String[] args) {
        int[]arr={4,3,7,5,2,3,1,2,8,7};
        maximum(arr, 4);
    }
}
