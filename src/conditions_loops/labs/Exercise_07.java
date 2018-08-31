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
        String word = scanner.nextLine();
        char[] vowelArray = {'a', 'e', 'i', 'o', 'u', 'y'};
        char[] textArray = word.toLowerCase().toCharArray();
        int intVowel = 0;
        int intText = 0;
        char cH = word.charAt(0);

        while(intVowel <= 5){
            if(vowelArray == textArray)
            System.out.println(intVowel);
            //System.out.println(intText);
            intVowel++;
            intText++;


        }



    }
}
