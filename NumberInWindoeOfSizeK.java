package QUEUE;
import java.util.*;
public class NumberInWindoeOfSizeK {
    public static void window(int[]arr,int k){
        Queue<Integer>q=new LinkedList<>();
        for (int i = 0; i < k-1; i++) {
            q.add(arr[i]);
        }
        for(int i=k-1;i<arr.length;i++){
            q.add(arr[i]);
            System.out.println(q);
            q.remove();
        }
    }public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8,9,10};
        window(arr, 3);
    }
}
