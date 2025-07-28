package collections;
import java.util.*;
public class arr {
    public static void main(String[] args) {
        ArrayList<Integer>arr = new ArrayList<>();
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
