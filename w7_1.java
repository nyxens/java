import java.util.*;
public class w7_1{
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
        a.add(2,25);
        System.out.println("Contains 30 :" + a.contains(30));
        System.out.println("Arraylist: " + a);
        Collections.sort(a,Collections.reverseOrder());
        System.out.println("ArrayList: " + a);
        System.out.println("ArrayList: " + a.reversed());
    }
} 