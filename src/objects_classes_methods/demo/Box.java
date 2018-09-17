package objects_classes_methods.demo;

public class Box {

    public static int numBoxesCreated;
    public int width;
    public int height;


    public Box(int width, int height) {
        this.width = width;
        this.height = height;
        numBoxesCreated++;
    }

    public static int getNumBoxesCreated() {
        return numBoxesCreated;
    }

    public static void setNumBoxesCreated(int numBoxesCreated) {
        Box.numBoxesCreated = numBoxesCreated;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

