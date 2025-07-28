package collections;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class queue{
    public static void main(String[] args) {
        Queue<Integer>arr = new PriorityQueue<>();
        arr.add(10);  //offer can also be used instead of add
        arr.add(20);
        arr.add(30);
        arr.add(40);
        System.out.println(arr);
        // arr.remove(2);
        arr.remove(1);
        System.out.println(arr);
        // Collections.reverse(arr);
        System.out.println(arr);
        // Collections.sort(arr);
        System.out.println(arr);

    }
}
