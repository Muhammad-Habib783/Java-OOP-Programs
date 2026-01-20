abstract class Payment_Method  // this is an abstract class
{
 // abstract methods for  payment and receipt
 abstract void process_payment(double amount);
 abstract void generate_receipt();
 void start_transaction() // non abstract function
 {
     System.out.println("Transaction started ");
 }
}
class credit_card_payment extends Payment_Method // sub class for credit card payment inherit from abstrat
{
 @Override
 void process_payment(double amount) 
 {
     System.out.println("Process  the  credit card payment  rs " + amount);
 }
 @Override
 void generate_receipt() // for receipt generate
 {
     System.out.println("Receipt  paid using credit card"); 
 }
}
class pay_pal_payment extends Payment_Method // sub class for paypal payment inherit from abstract 
{
 @Override
 void process_payment(double amount) 
 {
     System.out.println("Process paypal payment  rs " + amount);
 }
 @Override
 void generate_receipt() // for receipt generate
 {
     System.out.println("Receipt paid using paypal");
 }
}
class jazz_cash_payment extends Payment_Method // sub class for jazz cash payment inherit from abstract
{
 @Override
 void process_payment(double amount) 
 {
     System.out.println("Process jazzcash payment  rs " + amount);
 }
 @Override
 void generate_receipt() // for receipt generate
 {
     System.out.println("Receipt paid using jazzcash");
 }
}
public class Payment // main class
{
 public static void main(String[] args)
 {
     
     Payment_Method credit_card =new credit_card_payment(); // object created for credit card 
     Payment_Method pay_pal =new pay_pal_payment();  // object created for paypal 
     Payment_Method jazz_cash =new jazz_cash_payment(); // object created for jazzcash 

     credit_card.start_transaction();
     credit_card.process_payment(2400.0);
     credit_card.generate_receipt();

     pay_pal.start_transaction();
     pay_pal.process_payment(32300.0);
     pay_pal.generate_receipt();


     jazz_cash.start_transaction();
     jazz_cash.process_payment(3140.0);
     jazz_cash.generate_receipt();
 }
}



