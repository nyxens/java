import java.util.*;
public class w7_3{
    public static void main(String[] args){
        Vector<Integer> a = new Vector<Integer>();
        a.add(5);
        a.add(15);
        a.add(25);
        a.add(35);
        a.add(45);
        System.out.println(a);
        a.add(3, 18);
        a.remove(Integer.valueOf(25));
        System.out.println("Contains 60 : " + a.contains(60));
        Vector<String> b = new Vector<String>();
        b.add("Alice");
        b.add("Bob");
        b.add("Charlie");
        b.add("David");
        System.out.println("Print using for each");
        for(String name:b){
            System.out.print(name + " ");
        }
        System.out.println();
        ListIterator<String> iterator = b.listIterator();
        System.out.println("Print using ListIterator forward");
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println("Print using ListIterator backward");
        while(iterator.hasPrevious()){
            System.out.print(iterator.previous() + " ");
        }
        System.out.println();
    }
} 