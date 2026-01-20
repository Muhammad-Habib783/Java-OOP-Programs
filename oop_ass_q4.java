//parent class
class Character 
{
 String name;
 int health;
 int attackPower;
 int defensePower;
 Character(String name,int health,int attackPower,int defensePower)// constructor
 {
     this.name=name;
     this.health=health;
     this.attackPower=attackPower;
     this.defensePower=defensePower;
 }
 void displayInfo()// function to display character information
 {
     System.out.println("Name:"+name);
     System.out.println("Health:"+health);
     System.out.println("AttackPower:"+attackPower);
     System.out.println("DefensePower:"+defensePower);
 }
 void attack()// placeholder attack method
 {
     System.out.println(name+" attacks with a basic move");
 }
}
class Warrior extends Character// warrior child class
{
 Warrior(String name,int health,int attackPower,int defensePower) 
 {
     super(name,health,attackPower,defensePower);
 }
 @Override
 void attack()
 {
     System.out.println(name+" slashes with a sword!");
 }
}
class Mage extends Character// mage child class
{
 Mage(String name,int health,int attackPower,int defensePower) 
 {
     super(name,health,attackPower,defensePower);
 }
 @Override
 void attack()
 {
     System.out.println(name+" casts a powerful spell!");
 }
}
class Archer extends Character//archer child class
{
 Archer(String name,int health,int attackPower,int defensePower) 
 {
     super(name,health,attackPower,defensePower);
 }
 @Override
 void attack()
 {
     System.out.println(name+" shoots a precise arrow!");
 }
}
//main class
public class oop_ass_q4 //FantasyGameCharacterSystem 
{
 public static void main(String[] args) 
 {
     // create objects for different characters
     Warrior warrior=new Warrior("Thor",100,25,20);
     Mage mage=new Mage("Merlin",80,30,15);
     Archer archer=new Archer("Robin",90,20,25);

     // display character information and simulate attacks
     System.out.println("Character Information and Actions:");
     System.out.println("Warrior:");
     warrior.displayInfo();
     warrior.attack();
     System.out.println("Mage:");
     mage.displayInfo();
     mage.attack();
     System.out.println("Archer:");
     archer.displayInfo();
     archer.attack();
 }
}
