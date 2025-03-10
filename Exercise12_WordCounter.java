/*
 * Exercise 12: Word Counter
 * 
 * Write a program that asks the user for a sentence and then
 * counts how many words are in the sentence.
 * (Assume words are separated by spaces)
 */
import java.util.Scanner;

public class Exercise12_WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        // TODO: Count and print the number of words in the sentence
        String[] splitSent = sentence.split(" ");
        int i = 0;
         i = splitSent.length;

        System.out.println("There are " + i + " words in this sentence");
        scanner.close();
    }
}

// Expected output (if input is "Java is a programming language"):
// Number of words: 5
