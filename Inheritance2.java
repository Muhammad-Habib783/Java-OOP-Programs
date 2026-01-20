//Parent class
class car2
{
String brand = "Toyota";
void startEngine()
{
   System.out.println("Engine started...");
}
}
//Child class
class Car extends car2
{
String model = "Corolla";
void displayInfo()
{
   System.out.println("Brand: " + brand);
   System.out.println("Model: " + model);
}
}
//Main class to test inheritance
public class Inheritance2 
{
public static void main(String[] args) 
{
   Car myCar = new Car();

   myCar.startEngine();     // Inherited from gari
   myCar.displayInfo();     // Defined in Car
}
}
