// ************************************************************
// Count.java
//
// This program reads in strings (phrases) and counts the
// number of blank characters and certain other letters
// in the phrase.
// ************************************************************
import java.util.Scanner;

/**************************
 * Reads the number of spaces and other
 * letters and prints out the count
 * @author Rhea Lauzon A00881688
 * @version 1.0
 *
 */

public class Count {
    
    /************************
     * The main method
     * @param args
     *******************/
    public static void main(String[] args) {
        String phrase; // a string of characters
        int countBlank; // the number of blanks (spaces) in the phrase
        int countE = 0;
        int countA = 0;
        int countS = 0;
        int countT = 0;
        int length; // the length of the phrase
        char ch; // an individual character in the string
        Scanner scan = new Scanner(System.in);
        // Print a program header
        System.out.println();
        System.out.println("Character Counter");
        System.out.println();
        // Read in a string and find its length
        System.out.print("Enter a sentence or phrase: ");
        phrase = scan.nextLine();
        length = phrase.length();
        // Initialize counts
        countBlank = 0;
        // a for loop to go through the string character by character
        // and count the blank spaces

        for (int i = 0; i < length; i++) {

            if (phrase.charAt(i) == ' ') {

                countBlank++;
            ch = phrase.charAt(i);

            switch (ch) {
            case 'a':
            case 'A':
                countA++;
                break;
                
            case 'e':
            case 'E':
                countE++;
                break;
                
            case 's':
            case 'S':
                countS++;
                break;
                
            case 't':
            case 'T':
                countT++;
                break;
                
            default:
                break;
            }
        }
        }

        // Print the results
        System.out.println();
        System.out.println("Number of blank spaces: " + countBlank);
        System.out.println("Number of S's: " + countS);
        System.out.println("Number of T's: " + countT);
        System.out.println("Number of E's: " + countE);
        System.out.println("Number of A's: " + countA);
    }
}