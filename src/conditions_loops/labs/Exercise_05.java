package conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {

        //input from user, a lover and upper number
        System.out.println("I will calculate the value of some numbers, and their average. Please give me a lower and upper number :) Press enter to continue...");try{
            System.in.read();}catch(Exception e){
                e.printStackTrace();
            }
        }
        // create scanner
        Scanner lowerScan = new Scanner(System.in);
        // prompt user
        System.out.print("Lower: ");
        // assign input to variable as int
        int lower = lowerScan.nextInt();

        // create scanner
        Scanner upperScan = new Scanner(System.in);
        // prompt user
        System.out.print("Upper: ");
        // assign input to variable as int
        int upper = upperScan.nextInt();

        int sum = 0;
        double average = 0.0;

        //create a for-loop, for use in calculations below
        for(int averageLoop = lower; averageLoop <= upper; averageLoop++ ){
          sum = sum + averageLoop;
          average = (double)sum / (upper - lower + 1);
        }

        //sum of numbers

        System.out.println("The sum of all the numbers is: " + sum);

        //average of the numbers

        System.out.println("The average value of all the numbers is: " + average);
    }
}
