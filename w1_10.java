// import java.util.Random;
// import java.util.Scanner;
// public class w1_10
// {
//     public static void main(String[] args) 
//     {
//         String[] words = {"apple", "banana", "cherry", "grape", "mango"};
//         Random random = new Random();
//         String selectedWord = words[random.nextInt(words.length)];
//         Scanner scanner = new Scanner(System.in);
//         int attempts = 5;
//         System.out.println("Welcome to the Word Guessing Game!");
//         System.out.println("Guess the word. You have " + attempts + " attempts.");
//         for (int i = 0; i < attempts; i++) 
//         {
//             System.out.print("Enter your guess: ");
//             String userGuess = scanner.nextLine();
//             if (userGuess.equals(selectedWord)) 
//             {
//                 System.out.println("You guessed the word!");
//                 scanner.close();
//                 return;
//             } 
//             else if (userGuess.compareTo(selectedWord) < 0) 
//                 System.out.println("The word is later in the dictionary.");
//             else 
//                 System.out.println("The word is earlier in the dictionary.");
//             System.out.println("Attempts left: " + (attempts - i - 1));
//         }
//         System.out.println("you have used all your attempts.");
//         System.out.println("The correct word was: " + selectedWord);
//         scanner.close();
//     }
// }
