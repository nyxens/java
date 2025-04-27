import java.util.*;
import java.io.*;
public class practice8 {
    public static void main(String[] args) throws Exception {
        File file = new File("input.txt");
        Scanner scanner = new Scanner(file);
        FileWriter writer = new FileWriter("output.txt");
        while(scanner.hasNextLine()){
            String str = scanner.nextLine();
            String replace = str.replaceAll("Python","Java");
            writer.write(replace+"\n");
        }
        scanner.close();
        writer.close();
    }
}

