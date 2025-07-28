package collections;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class tree {
     public static void main(String[] args) {
        SortedSet<Integer>arr=new TreeSet<>();
        arr.add(2);
        arr.add(3);
        arr.add(5);
        arr.add(10);
        arr.add(100);
        System.out.println(arr);
        arr.remove(2);
        System.out.println(arr);
    }
}
