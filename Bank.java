
abstract class Bank1 
{
    abstract double getBalance();
}
class BankA extends Bank1 
{
    double balance=100;
   double getBalance()
   {
        return balance;
    }
}
class BankB extends Bank1 
{
    double balance=150;
    double getBalance() 
    {
        return balance;
    }
}
class BankC extends Bank1 
{
    double balance=200;
   double getBalance()
    {
        return balance;
    }
}
public class Bank 
{
    public static void main(String[] args) 
    {
        Bank1 b1=new BankA();
        System.out.println("Balance "+b1.getBalance()+"$ deposited sucesssfully in Bank A");
        Bank1 b2=new BankB();
        System.out.println("Balance "+b2.getBalance()+"$ deposited sucesssfully in Bank B");
        Bank1 b3=new BankC();
        System.out.println("Balance "+b3.getBalance()+"$ deposited sucesssfully in Bank C");
    }
}
