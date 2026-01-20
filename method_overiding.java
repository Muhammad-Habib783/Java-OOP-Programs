class Calculator 
{

    int add(int a, int b) 
    {
        return a + b;
    }
    double add(double a, double b)
    {
        return a + b;
    }
    int add(int a, int b, int c)
    {
        return a + b + c;
    }
}
class Animal1
{
    void sound() 
    {
        System.out.println("Animal makes sound");
    }
}
class Dog1 extends Animal1
{
    @Override
    void sound()
    {
        System.out.println("Dog barks");
    }
}
public class method_overiding
{
    public static void main(String[] args)
    {
       // --- Overloading Demo ---
        Calculator calc = new Calculator();
        System.out.println("Add 2 ints: " + calc.add(5, 10));           // 15
        System.out.println("Add 2 doubles: " + calc.add(5.5, 4.5));     // 10.0
        System.out.println("Add 3 ints: " + calc.add(1, 2, 3));         // 6

        // --- Overriding Demo ---
        Animal1 myDog = new Dog1();   // parent type, child object
        myDog.sound();              // Dog barks
    }
}
