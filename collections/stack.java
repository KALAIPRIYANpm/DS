package collections;

import java.util.Collections;
import java.util.Stack;
import java.util.Vector;

public class stack {
    
        public static void main(String[] args) {
        Stack<Integer>arr = new Stack();
        arr.push(10);
        arr.push(20);
        arr.push(30);
        arr.push(40);
        System.out.println(arr);
        // arr.remove(2);
        arr.pop();
        System.out.println(arr);
        Collections.reverse(arr);
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);

    }
}
