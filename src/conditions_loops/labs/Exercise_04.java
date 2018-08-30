package conditions_loops.labs;

/**
 * Conditions and Loops Exercise 4: Even numbers
 *
 *      Using a "for-loop", print out all even numbers from 1-100.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {
        int evenNumbers;

        for(evenNumbers = 1; evenNumbers <= 100; evenNumbers++)
            if(evenNumbers % 2 == 0)
            System.out.println(evenNumbers);
            else System.out.println("D'OH!");

    }
}
