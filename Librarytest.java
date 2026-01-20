import java.util.Scanner; // library for input
abstract class Library_account // abstract class represent a library account
{
 String member_name;
 int books_borrowed;
 int late_returns;
 double penalty_per_late_return;
 double membership_fee;
//constuctor to initialize details
 public Library_account(String member_name,double membership_fee,double penalty_per_late_return)  
 {
     this.member_name=member_name;
     this.membership_fee=membership_fee;
     this.penalty_per_late_return=penalty_per_late_return;
     this.books_borrowed=0;
     this.late_returns=0;
 }
 public void borrow_book() // function for increment borrowed books
 {
     books_borrowed++;
 }
 public void return_late_book() // function for increment late returns
 {
     late_returns++;
 }
 abstract double calculate_penalty(); // abstract function to calculate penalty
 abstract void monthly_process(); // abstract function for montly process
}
class Student_account extends Library_account // student sub class inherit from abstract class
{
 int max_borrow_limit=5;
public Student_account(String memberName)
 {
     super(memberName,200.0,100.0); // member ship fee is  200 and  Penalty is 100 per late return
 }
 @Override
 public void borrow_book() 
 {
     if(books_borrowed<max_borrow_limit) 
     {
         super.borrow_book(); // we call super function for increment 
     } 
     else
     {
         System.out.println("warning cannot borrow more books");
     }
 }
 @Override
 double calculate_penalty() 
 {
     return late_returns*penalty_per_late_return;
 }
 @Override
 void monthly_process() 
 {
     double total_penalty=calculate_penalty();
     double total_due=membership_fee+total_penalty;
     System.out.println("\n Monthly summary is ");
     System.out.println("Member  " + member_name);
     System.out.println("Type  Student");
     System.out.println("Books Borrowed " + books_borrowed);
     System.out.println("Late Returns " + late_returns);
     System.out.println("Penalty  " + total_penalty);
     System.out.println("Membership fee is  " + membership_fee);
     System.out.println("Total amount  " + total_due);
 }
}
class Faculty_account extends Library_account  // faculty account subclass inherit from abstract 
{ 
 public Faculty_account(String memberName) 
 {
     super(memberName,500.0,50.0); // Membership fee is  500 and  Penalty is  50 per extra late return 
 }
 @Override
 double calculate_penalty() 
 {
     return(late_returns>2)?(late_returns-2)*penalty_per_late_return:0;// here we use statement terminator for faculty if more than 2 than charges else not 
 }
 @Override
 void monthly_process() 
 {
     double total_penalty=calculate_penalty();
     double total_due=membership_fee+total_penalty;
     System.out.println("\n Monthly summary is ");
     System.out.println("Member " + member_name);
     System.out.println("Type  Faculty");
     System.out.println("Books borrowed " + books_borrowed);
     System.out.println("Late returns " + late_returns);
     System.out.println("Penalty  " + total_penalty);
     System.out.println("Membership fee is  " + membership_fee);
     System.out.println("Total amount due " + total_due);
 }
}
public class Librarytest // main class 
{
 public static void main(String[] args)
 {
     Scanner scanner=new Scanner(System.in); // for input 

     System.out.println(" Welcome to RIPHAH  Library System \n");

     System.out.print("Enter member name  ");
     String name=scanner.nextLine();

     System.out.print("Enter account type student/faculty ");
     String accountType=scanner.nextLine().toLowerCase(); // we can use this for taking one line input and convert uppercase words to lowecase

     Library_account account; // declaration
     if(accountType.equals("student")) // check if student  
     {
         account=new Student_account(name);
     } 
     else if(accountType.equals("faculty")) // check if faculty
     {
         account=new Faculty_account(name);
     }
     else 
     {
         System.out.println("Invalid account type exiting "); // if upper bot statement are false than this else
         return;
     }
     System.out.println("\n borrow 3 books");
     account.borrow_book();
     account.borrow_book();
     account.borrow_book();

     System.out.println(" return 1 book late");
     account.return_late_book();
     
     account.monthly_process(); // end of month processing 
     scanner.close();
 }
}

