package conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 1: Even or Odd
 *
 *      Write a program that gets a number between 1 and 1,000,000,000
 *      from the user and determines whether it is odd
 *      or even using an if statement. Print the result.
 *
 *      NOTE: We will be using the Scanner class to collect user input. This is demonstrated below.
 */

public class Exercise_01 {

    public static void main(String[] args) {

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter a number between 1 and 1,000,000 to determine whether it is odd or even (-7 to exit): ");
        // assign input to variable as int
        int number = scanner.nextInt();

        do {
            if(number < 0){
                System.out.println(number + " is too low");

            } else if (number > 1000000){
                System.out.println(number + " is too high");

            } else {
                if(number % 2 == 0){
                    System.out.println(number + " is even");
                } else {
                    System.out.println(number + " is odd");
                }
            }

            System.out.print("Enter a number between 1 and 1,000,000 to determine whether it is odd or even (-7 to exit): ");

            number = scanner.nextInt();

        } while(number != -7);
        System.out.println("Thanks for using the even/odd number checker. Goodbye!");

        int val = 0;

        System.out.println("while loop");
        while (val < 10){
            System.out.println(val);
            val++;
        }
        System.out.println("for loop");
        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }
    }
}
