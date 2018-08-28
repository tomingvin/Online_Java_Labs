package fundamentals.labs;
import java.lang.Math.*;

/**
 * Fundamentals Exercise 4: Area and Perimeter
 *
 *      Write the necessary code to calculate the area and perimeter of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        // write code here

        double CylinderHeight = 5.0;
        double CylinderRadius = 3.14;
        double CylinderArea = 2 * Math.PI * CylinderRadius * CylinderHeight + 2 * Math.PI * CylinderRadius * CylinderRadius;
        double CylinderPerimeter = CylinderRadius * 2 * Math.PI;
        System.out.println("The area of the cylinder is: " + CylinderArea);
        System.out.println("The perimeter of the cylinder is: " + CylinderPerimeter);

    }
}
