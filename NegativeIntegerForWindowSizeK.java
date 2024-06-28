package QUEUE;

import java.util.*;

public class NegativeIntegerForWindowSizeK {
    public static void nagative(int[] arr, int k) {
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<k-1;i++){
            q.add(arr[i]);
        }for(int i=k-1;i<arr.length;i++){
            q.add(arr[i]);
            boolean found=false;
            for(int j:q){
                if(j<0){
                    found=true;
                    System.out.println(j);
                    break;
                }
            }if(!found){
                System.out.println(0);
            }
            q.remove();
        }
    }public static void optomal(int[]arr,int k){
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<k-1;i++){
            if(arr[i]<0){
                q.add(i);
            }
        }for(int i=k-1;i<arr.length;i++){
            if(arr[i]<0){
                q.add(i);
            }if(q.isEmpty()){
                System.out.println(0);
            }else{
                if(q.peek()<=i-k){
                    q.remove();
                }if (q.isEmpty()) {
                    System.out.println(0);
                }else{
                    System.out.println(arr[q.peek()]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[]arr={2,-3,-4,-2,7,8,9,-10};
        // nagative(arr, 3);
        optomal(arr, 3);
    }

}
