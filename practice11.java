import java.util.*;
public class practice11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String year = input.substring(2,6);
        String id = input.substring(6,10);
        boolean isGrad = false;
        if(input.startsWith("UG")){
            isGrad = true;
        }
        if(isGrad){
            System.out.println("UG : yes");
        }else{
            System.out.println("UG : no");
        }
        System.out.println("Year : " + year);
        System.out.println("ID : " + id);
        
    }
}
