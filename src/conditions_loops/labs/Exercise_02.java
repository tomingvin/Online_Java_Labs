package conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Tell me a number, and I'll tell you what day in a week has that number: ");
        // assign input to variable as int
        int number = scanner.nextInt();

        if (number < 8) {

            if (number == 1)
                System.out.println("Monday");

            if (number == 2)
                System.out.println("Tuesday");

            if (number == 3)
                System.out.println("Wednensday");

            if (number == 4)
                System.out.println("Thursday");

            if (number == 5)
                System.out.println("Friday");

            if (number == 6)
                System.out.println("Saturday");

            if (number == 7)
                System.out.println("Sunday");

            if (number < 1)
                System.out.println("There is no day zero and there are no negative days! :)");

        } else {
            System.out.println("There are 7 days in a week, so " + number + " is not an option");
        }
    }
}