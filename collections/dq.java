package collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class dq {
      public static void main(String[] args) {
        Deque<Integer>arr = new LinkedList<>();
        arr.add(10);  //offer can also be used instead of add
        arr.addFirst(100);
        arr.addLast(20);
        arr.add(40);
        arr.add(30);
        // arr.add(40);
        System.out.println(arr);
        // arr.remove(2);
        arr.remove(1);
        System.out.println(arr);
        // Collections.reverse(arr);
        System.out.println(arr);
        // Collections.sort(arr);
        arr.removeFirst();
        System.out.println(arr);
        arr.removeLast();
        System.out.println(arr);
        arr.clear();
        System.out.println(arr);
    }
}
