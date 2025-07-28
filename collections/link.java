package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class link {
    public static void main(String[] args) {
        LinkedList<Integer>arr = new LinkedList();
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
