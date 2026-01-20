class SBP 
{
    double minimum_interest_rate=4.0;
    double withdrawal_limit=100000;
    double getInterestRate() 
    {
        return minimum_interest_rate;
    }

    double getWithdrawalLimit() 
    {
        return  withdrawal_limit;
    }
}
class Customer
{
    String name;
    String cnic;
    Customer(String name,String cnic)
    {
        this.name=name;
        this.cnic=cnic;
    }
    void display_customer_info() 
    {
        System.out.println("customer name is "+name);
        System.out.println("cnic  is  "+cnic);
    }
}
class Account
{
    String accountNumber;
    double balance;
Account(String accountNumber,double balance) 
    {
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
   void display_account_info() 
    {
        System.out.println("Account Number is  "+accountNumber);
        System.out.println("Balance is  "+balance);
    }
}
class NBP extends SBP 
{
    double getInterestRate() 
    {
        return 5.0;
    }
}
class BankAlfalah extends SBP 
{
    double getInterestRate() 
    {
        return 4.5;
    }
}
class SilkBank extends SBP
{
    double getInterestRate() 
    {
        return 4.8;
    }
}
class AlliedBank extends SBP 
{
    double getInterestRate() 
    {
        return 5.2;
    }
}
class BankSystem 
{
    public static void main(String[] args) 
    {
        Customer customer=new Customer("Ali","12345-1234512-3");
        Account account=new Account("001232673478",100000);

        SBP nbp=new NBP();
        SBP bankAlfalah=new BankAlfalah();
        SBP silkBank=new SilkBank();
        SBP alliedBank=new AlliedBank();

        System.out.println("NBP interest rate is  "+nbp.getInterestRate()+ "%");
        System.out.println("bank alfalah interest rate is "+bankAlfalah.getInterestRate() +"%");
        System.out.println("Silk Bank interest rate is "+silkBank.getInterestRate() +"%");
        System.out.println("Allied Bank interest rate is  "+alliedBank.getInterestRate() +"%");

        System.out.println("\n Customer and Account Details are ");
        customer.display_customer_info();
        account.display_account_info();
    }
}

