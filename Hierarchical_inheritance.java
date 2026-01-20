//Parent class (User)
class User 
{
 void login() 
 {
     System.out.println("User logged in.");
 }

 void logout() 
 {
     System.out.println("User logged out.");
 }
}
//First child class (Admin)
class Admin extends User 
{
 void manageUsers() 
 {
     System.out.println("Admin can add or remove users.");
 }
}
//Second child class (Customer)
class Customer extends User 
{
void placeOrder() 
{
     System.out.println("Customer placed an order.");
}
}
//Main class to test hierarchical inheritance
public class Hierarchical_inheritance 
{
 public static void main(String[] args) 
 {
     // Creating an Admin object
     Admin admin = new Admin();
     System.out.println("Admin:");
     admin.login();        // From User
     admin.manageUsers();  // From Admin

     // Creating a Customer object
     Customer customer = new Customer();
     System.out.println("\nCustomer:");
     customer.login();     // From User
     customer.placeOrder(); // From Customer
 }
}
