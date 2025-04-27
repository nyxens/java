import java.util.*;
import java.io.*;
public class practice7 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt");
        Scanner scanner = new Scanner(file);
        int line = 0;
        int words = 0;
        int characters = 0;
        while(scanner.hasNextLine()){
            line++;
            String str = scanner.nextLine();
            String deleted = str.replaceAll("\\W","");
            characters += deleted.length();
            String[] word = str.replaceAll("\\W"," ").split("\\s+");
            words += word.length;
        }
        System.out.println("Number of lines: " + line);
        System.out.println("Number of words: " + words);
        System.out.println("Number of characters: " + characters);
        scanner.close();
    }
}

