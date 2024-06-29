package QUEUE;

import java.util.*;

import basicHASHING.characterHashing;

public class NonReaptingCharacter {
    public static void reaptong(char[] arr) {
        Queue<Character> q = new LinkedList<>();
        Set<Character> list = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            //char c=arr[i];
            if (list.contains(arr[i])) {
                q.remove();
            } else {
                q.add(arr[i]);
            }
            list.add(arr[i]);

            if (q.isEmpty()) {
                System.out.print("#"+" ");
            } else {
                System.out.print(q.peek()+" ");
            }
        }
    }

    public static void main(String[] args) {
        char[] arr = { 'a', 'b', 'a', 'b', 'd', 'c' };
        reaptong(arr);
    }
}
