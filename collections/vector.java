package collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Vector;

public class vector {
        public static void main(String[] args) {
        Vector<Integer>arr = new Vector();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        System.out.println(arr);
        arr.remove(2);
        System.out.println(arr);
        Collections.reverse(arr);
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);

    }
}
