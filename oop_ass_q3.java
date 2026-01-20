// parent class 
class Vehicle
{
 String make;
 String model;
 int year;
 double dailyRentalRate;
 Vehicle(String make,String model,int year,double dailyRentalRate)// constructor
 {
     this.make=make;
     this.model=model;
     this.year=year;
     this.dailyRentalRate=dailyRentalRate;
 }
 double calculateRentalCost(int days)// function to calculate rental cost
 {
     return dailyRentalRate*days;
 }
 void displayInfo()// function to display vehicle information
 {
     System.out.println("Make:"+make);
     System.out.println("Model:"+model);
     System.out.println("Year:"+year);
     System.out.println("DailyRentalRate: "+dailyRentalRate+" USD");
 }
}
class Sedan extends Vehicle// Sedan child class
{
 Sedan(String make,String model,int year,double dailyRentalRate) 
 {
     super(make,model,year,dailyRentalRate);
 }
}
class SUV extends Vehicle// SUV child class
{
 SUV(String make,String model,int year,double dailyRentalRate) 
 {
     super(make,model,year,dailyRentalRate);
 }
}
class LuxuryCar extends Vehicle// LuxuryCar child class
{
 boolean leatherSeats;
 boolean gps;
 boolean premiumSoundSystem;
 LuxuryCar(String make,String model,int year,double dailyRentalRate,boolean leatherSeats,boolean gps,boolean premiumSoundSystem)// constructor
 {
     super(make,model,year,dailyRentalRate);
     this.leatherSeats=leatherSeats;
     this.gps=gps;
     this.premiumSoundSystem=premiumSoundSystem;
 }
 @Override
 void displayInfo()// display function
 {
     super.displayInfo();
     System.out.println("LeatherSeats:"+(leatherSeats?"Yes":"No"));
     System.out.println("GPS ="+(gps?"Yes":"No"));
     System.out.println("PremiumSoundSystem:"+(premiumSoundSystem?"Yes":"No"));
 }
}
// main class
public class oop_ass_q3 //VehicleManagementSystem
{
 public static void main(String[] args) 
 {
     // create objects
     Sedan sedan=new Sedan("Suzuki","abc",2020,40.0);
     SUV suv=new SUV("Toyota","Fortuner",2022,80.0);
     LuxuryCar luxuryCar=new LuxuryCar("Honda","abc",2023,120.0,true,true,true);// true for booleant
     int days=5; 
     System.out.println("Rental Information=");
     
     System.out.println("Sedan");
     sedan.displayInfo();
     System.out.println("RentalCost for "+days+" days: "+sedan.calculateRentalCost(days));

     System.out.println("SUV");
     suv.displayInfo();
     System.out.println("RentalCost for "+days+" days: "+suv.calculateRentalCost(days));

     System.out.println("LuxuryCar");
     luxuryCar.displayInfo();
     System.out.println("RentalCost for "+days+" days: "+luxuryCar.calculateRentalCost(days));
 }
}
