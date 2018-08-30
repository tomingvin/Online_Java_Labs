package conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and usig a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Some text: ");
        // assign input to variable as int
        String vowel = scanner.nextLine();
        System.out.println(vowel);
    }
}
