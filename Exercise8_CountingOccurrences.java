/*
 * Exercise 8: Counting Occurrences
 * 
 * Write a program that asks the user for a string and a character,
 * then counts how many times that character appears in the string.
 */
import java.util.Scanner;

public class Exercise8_CountingOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        System.out.print("Enter a character to count: ");
        char charToCount = scanner.nextLine().charAt(0);
        
        // TODO: Count and print the number of occurrences of the character
        int counter = 0;
        for (int i = 0; i < input.length() - 1; i++){
            if (input.charAt(i) == charToCount){
                counter++;
            }
        }
        System.out.print("There are " + counter + " " + charToCount + "'s within this sentence: " + input);
        scanner.close();
    }
}

// Expected output (if input is "programming" and char is 'm'):
// The character 'm' appears 2 times in the string.
