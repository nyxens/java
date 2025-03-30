import java.util.*;
public class w10_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input string : ");
        String input = sc.nextLine();
        input = input.replaceAll("\\W", " ");
        String words[] = input.split("\\s+");
        Map<String,Integer> frequencyMap = new HashMap<>();
        for(String word : words){
            word = word.toLowerCase();
            if(!word.isEmpty()){
                frequencyMap.put(word,frequencyMap.getOrDefault(word,0) + 1);
            }
        }
        System.out.println("Word Frequency:");
        for(Map.Entry<String,Integer> entry : frequencyMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        sc.close();
    }
}