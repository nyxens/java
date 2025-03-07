import java.util.Scanner;
public class w5_1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input1 = scanner.nextLine();
        System.out.print("Print Vowel:1 Consonant:0 Enter: ");
        int input2 = scanner.nextInt();
        System.out.print("Print UPPERCASE:1 lowercase:0 Enter: ");
        int input3 = scanner.nextInt();
        scanner.close();
        StringBuilder result = new StringBuilder();
        String vowels = "aeiouAEIOU";//to check if string contains any vovel
        for(char ch:input1.toCharArray()){
            if((input2 == 1&&vowels.indexOf(ch) != -1)||(input2 == 0&&vowels.indexOf(ch) == -1)){ //returns index something if found
                result.append(ch);
            }
        }
        String output;
        if(input3 == 1){
            output = result.toString().toUpperCase();
        }else{
            output = result.toString().toLowerCase();
        }
        System.out.println("Result: " + output);
    }
}
