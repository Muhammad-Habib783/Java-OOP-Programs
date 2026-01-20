class Charger
 {
    void charge(Phone p)
    {
        System.out.println("Charging Phone");
    }
    void charge(Laptop l)
    {
        System.out.println("Charging Laptop");
    }
    void charge(Tablet t)
    {
        System.out.println("Charging Tablet");
    }
}
class Phone {}
class Laptop {}
class Tablet {}
public class Charging
{
    public static void main(String[] args) {
        Charger charger = new Charger();
        charger.charge(new Phone());   // Output: Charging Phone
        charger.charge(new Laptop());  // Output: Charging Laptop
        charger.charge(new Tablet());  // Output: Charging Tablet
    }
}