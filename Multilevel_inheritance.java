// Base class
class LivingThing {
    void breathe() {
        System.out.println("Breathing...");
    }
}

// Intermediate class (inherits from LivingThing)
class Animal_a extends LivingThing {
    void eat() {
        System.out.println("Eating...");
    }
}

// Derived class (inherits from Animal)
class Dog extends Animal_a {
    void bark() {
        System.out.println("Barking...");
    }
}

// Main class to test multilevel inheritance
public class Multilevel_inheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        myDog.breathe();  // From LivingThing
        myDog.eat();      // From Animal
        myDog.bark();     // From Dog
    }
}
