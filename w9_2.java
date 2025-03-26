import java.util.*;
public class w9_2{
    public static void main(String[] args){
        LinkedHashSet<String> uniqueVisitors = new LinkedHashSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter IP addresses of visitors (type 'exit' to stop):");

        while(true){
            String ip = scanner.nextLine();
            if(ip.equalsIgnoreCase("exit")){
                break; 
            }
            uniqueVisitors.add(ip);
        }

        scanner.close();

        System.out.println("Unique visitors in the order they arrived:");
        for(String visitor : uniqueVisitors){
            System.out.println(visitor);
        }
    }
} 