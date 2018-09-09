package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 1:
 *
 *      Create three classes, all of which can be inside this file. The first class (the controller)
 *      should have the main method. The main method should create at least two objects using the
 *      constructors of the second and third class. The second and third class should each have at least
 *      three instance variables that should be set using the constructor when an object is created.
 *
 *      Once the objects are created, try changing the values of some of the instance variables.
 *
 *      Think about some of the examples we have seen from the lectures or Confluence Docs.
 *
 *      Be creative. Have some fun. Using Java objects you can model just about anything you want.
 *      Cars, animals, poker games, sports teams, trees, beers, people and so on.
 */

public class Person {

    public static void main(String[] args) {

        Person john = new Person();
     
    }

}

 public   class Zombie extends Person {
      public  Boolean friendly;
        String food;
        String song;

        @Override
        public String toString() {
            return "Zombie{" +
                    "friendly=" + friendly +
                    ", food='" + food + '\'' +
                    ", song='" + song + '\'' +
                    '}';
        }
    }

    class Clothing extends Person {
        String shoes;
        String pants;
        String hat;

        @Override
        public String toString() {
            return "Clothing{" +
                    "shoes='" + shoes + '\'' +
                    ", pants='" + pants + '\'' +
                    ", hat='" + hat + '\'' +
                    '}';
        }
    }
