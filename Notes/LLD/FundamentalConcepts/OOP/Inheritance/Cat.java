public class Cat extends Pets {
    public Cat() {
        //super(); // calls Pet()
        System.out.println("Child Cat constructor called");
    }

    public Cat(String name, int age) {
        super(name, age); // calls Pet(String, int)
        System.out.println("Child Cat parameterized constructor called");
    }
    //default name - since java does not support default parameter value
    public Cat( int age) {
        super("meow meow", age); // calls Pet(String, int)
        System.out.println("Child Cat parameterized constructor called");
    }

    @Override
    public void speak() {
        System.out.println(getName() + " says: Meow!");
    }

    public void climbTree() {
        System.out.println( " climbs a tree.");
    }
}
