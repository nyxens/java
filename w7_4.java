import java.util.*;
public class w7_4{
    public static void main(String[] args){
        Stack<Integer> a = new Stack<Integer>();
        a.add(5);
        a.add(15);
        a.add(25);
        a.add(35);
        a.add(45);
        System.out.println(a);
        a.push(12);
        a.push(22);
        a.push(32);
        a.pop();
        a.pop();
        System.out.println(a);
        
        Stack<Integer> b = new Stack<Integer>();
        b.push(100);
        b.push(200);
        b.push(300);
        b.push(400);
        System.out.println(b.peek());
        
        Stack<Integer> c = new Stack<Integer>();
        c.add(10);
        c.add(20);
        c.add(30);
        c.add(40);
        c.add(50);
        if(c.contains(30)){
            System.out.println(c.search(30));
        }

        Stack<String> d = new Stack<String>();
        System.out.println("Empty : "+d.empty());
        d.push("Apple");
        d.push("Banana");
        d.push("Cherry");
        System.out.println("Empty : "+d.empty());

        String input = "STACK";
        StringBuilder sb = new StringBuilder("");
        Stack<Character> e = new Stack<Character>();
        for(Character x : input.toCharArray()){
            e.push(x);
        }
        //Collections.reverse(e);
        while(!e.empty()){
            sb.append(e.peek());
            e.pop();
        }
        String output = sb.toString();
        System.out.println(output);

        String bracket = "([{}])";
        System.out.println("Balanced : " + isBalanced(bracket));

    }

    public static boolean isBalanced(String bracket){
        Stack<Character> e = new Stack<Character>();
        for(char ch:bracket.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
            e.push(ch);
            }else if(ch == ')' || ch == '}' || ch == ']'){
                if(e.isEmpty()){
                return false;
                }
                char top = e.pop();
                if((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')){
                return false;
                }   
            }
        }
        return e.isEmpty(); 
    }
} 