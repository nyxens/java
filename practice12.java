import java.util.*;
public class practice12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean containsdigit = str.matches("\\d");
        String pass;
        System.out.println(str.length());
        pass = str.charAt(0) + str.substring(1,str.length()-1).replaceAll("\\w","*") + str.charAt(str.length()-1);
        System.out.println(pass);
        if(containsdigit){
            System.out.println("Contains digit: yes");
        }else{
            System.out.println("Contains digit: no");
        }
    }
}
