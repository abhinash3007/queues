package QUEUE;

import java.util.LinkedList;
import java.util.Queue;

public class TimeNeededToBuyTickets {
    public static void timeNeeded(int[]arr,int k) {
        Queue<Integer> q = new LinkedList<>();
        int time = 0;
        for (int i = 0; i < arr.length; i++) {
            q.add(i);
        }
        while (arr[k] != 0) {
            int index = q.peek();
            arr[index]--;
            if (arr[index] != 0) {
                q.add(index);
                q.remove();
            } else {
                q.remove();
            }time++;
        }System.out.println(time);
    }

    public static void main(String[] args) {
       int[]arr={1,5,2,3,7};
        timeNeeded(arr,3);
    }
}
