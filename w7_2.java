import java.util.*;
public class w7_2{
    public static void main(String[] args){
        LinkedList<Integer> a = new LinkedList<Integer>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
        System.out.println(a);
        a.add(2, 25);
        System.out.println(a);
        a.remove(Integer.valueOf(40));
        System.out.println(a);
        System.out.println("Contains 30 : " + a.contains(30));
        System.out.println("Print using for each");
        for(Integer num:a){
            System.out.print(num + " ");
        }
        System.out.println();
        ListIterator<Integer> iterator = a.listIterator();
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