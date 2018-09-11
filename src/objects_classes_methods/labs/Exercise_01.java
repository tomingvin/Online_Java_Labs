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

class Controller {

    public static void main(String[] args) {
        Person tom = new Person(40, "Tom", "software engineer");
        tom.setAge(41);
        tom.setJobTitle("QA");
        System.out.println(tom.toString());
    }

}

class Person extends Animal{


    private String name;
    private String jobTitle;

    public Person (int age){

        super(age, "homo sapien");
    }

    public Person(int age, String name) {
        super(age, "homo sapien");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Person(int age, String name, String jobTitle) {
        super(age, "homo sapien");
        this.name = name;
        this.jobTitle = jobTitle;


    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", age=" + getAge() +
                ", species='" + getSpecies() + '\'' +
                '}';
    }
}

class Animal {

    private int age;
    private String species;

    public Animal(int age, String species) {
        this.age = age;
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}