//runtimepolymorphismexample
class TV {
 void turnOn()
{
     System.out.println("TV is turning on");
 }
}
class Sony extends TV 
{
 void turnOn()
{
     System.out.println("Sony TV is turning on");
 }
}
class Samsung extends TV 
{
void turnOn() 
{
     System.out.println("Samsung TV is turning on");
 }
}
public class Run_time_polymorphism 
{
     public static void main(String[] args) 
     {
     TV t1 = new Sony();
     TV t2 = new Samsung();

     t1.turnOn();  // Output: Sony TV is turning on
     t2.turnOn();  // Output: Samsung TV is turning on
 }
}