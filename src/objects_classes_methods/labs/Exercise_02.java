package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 2:
 *
 *      Create a class that demonstrates the following: (all methods below can be in the same class)
 *
 *      1) A static method that calls another static method.
 *      2) A static method that calls a non-static method.
 *      3) A non-static method1 that calls another non-static method2, but this time method2 should return a value to method1.
 *      4) A non-static method1 that calls another non-static method2 and passes a value to method2.
 */


class main {

    public static int first (int a, int b) {

        int sum = a + b;
        System.out.println(sum);
        return(sum);

    }
    public static void second(int something) {

        something = first(1, 2);

}


    public static void main(String[] args) {
        System.out.println();
    }
}