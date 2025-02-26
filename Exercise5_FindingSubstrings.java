/*
 * Exercise 5: Finding Substrings
 * 
 * Write a program that asks for a sentence and a word, then checks if
 * the word appears in the sentence.
 */
import java.util.Scanner;

public class Exercise5_FindingSubstrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        System.out.print("Enter a word to find: ");
        String word = scanner.nextLine();
        
        // TODO: Check if the word appears in the sentence using contains()
        // or indexOf() methods
        System.out.print(sentence.contains(word));
        scanner.close();
    }
}

// Expected output (if sentence is "Java programming is fun" and word is "programming"):
// The word 'programming' was found in the sentence.

