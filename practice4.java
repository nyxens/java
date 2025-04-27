import java.util.*;
import java.lang.*;
import java.lang.reflect.Array;
public class practice4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("date");
        list.add("elderberry");
        list.add("fig");

        ArrayList<String> list2 = new ArrayList<>(list.reversed());
        System.out.println(list2);
        // System.out.println("Original list: " + list);
        // System.out.println("Reversed list: " + list.reversed());
    }
}
