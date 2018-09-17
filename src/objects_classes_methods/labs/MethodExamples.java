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

public class MethodExamples {

    public static void main(String[] args) {

        // call another static method in the same class - just call it
        staticMethod1();

        // call another static method in the same class and pass an argument
        staticMethod2("this is an argument");

        // call another static method in the same class, pass two arguments, and get a return value back
        int value = staticMethod3(3,4);
        System.out.println(value);

        // create an object of this class so I can call non-static methods
        MethodExamples obj = new MethodExamples();

        // to call a non-static method from a static context, or a non-static method in any other class, you must create
        // an object of the class that contains the non-static method and use that object to call the method
        obj.nonStaticMethod1();;

        // call non-static method and pass an argument
        obj.nonStaticMethod2(123);

        // call a non-static method, and from within that non-static method have it call another non-static method

    }

    public static void staticMethod1(){
        System.out.println("staticMethod1 called");
    }

    public static void staticMethod2(String str){
        System.out.println("staticMethod 2 called " + str);
    }


    public static int staticMethod3(int a, int b){
        System.out.println("staticMethod 3 called ");
        return a * b;
    }

    public void nonStaticMethod1(){
        System.out.println("non-static method called");
    }

    public void nonStaticMethod2(int x){
        System.out.println("non-static method 2 called " + x);
    }

    public void nonStaticMethod3(){
        System.out.println("inside nonStatic method 3, calling non-static method 4... ");
        nonStaticMethod4();
    }

    public void nonStaticMethod4(){
        System.out.println("inside non-static method 4");
    }


}