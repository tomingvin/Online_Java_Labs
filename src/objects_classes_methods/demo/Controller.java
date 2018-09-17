package objects_classes_methods.demo;

public class Controller {

    public static void main(String[] args) {

        Box square = new Box(4, 4);
        square.setHeight(5);
        square.setWidth(5);

        int numBoxes = Box.getNumBoxesCreated();

        method1();

        Controller test = new Controller();
        test.method2();

        double x = Math.PI;

        int y = MyMathClass.multiply(2, 4);
        

    }

    public static void method1(){
        System.out.println("inside method1");
    }

    public void method2(){
        System.out.println("inside mothod2");
        method3();
    }

    public void method3(){
        System.out.println("inside mothod3");
    }

}
