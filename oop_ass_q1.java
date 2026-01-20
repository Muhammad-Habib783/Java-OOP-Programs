class Employee
{
  int employeeID;  
  String name;    
  Employee(int empID,String empName)
 {
     super();// call to Object constructor 
     employeeID=empID; 
     name=empName;    
 }
 double calculateSalary() 
 {
     return 0;// Default function overridden by subclasses
 }
}
//class for full time Employees
class FullTimeEmployee extends Employee
{
  double monthlySalary;
 // Constructor for full time employee
  FullTimeEmployee(int empID, String empName, double salary)
 {
     super(empID,empName);// call parent constructor to set id  and name
     monthlySalary=salary;// set  monthly salary
 }
 @Override
  double calculateSalary()
 {
     return monthlySalary; // this will return monthly salary to main function
 }
}
//class for part time Employee
class PartTimeEmployee extends Employee
{
 double hourlyRate;// hourly pay rate
  int hoursWorked;// total hours worked
 //constructor for part time employee
PartTimeEmployee(int empID,String empName,double rate,int hours) 
 {
     super(empID,empName);//set employee id and name using parent constructor
     hourlyRate=rate;// set hourly pay rate
     hoursWorked=hours;// set number of hours worked
 }
 @Override
 double calculateSalary() 
 {
     return hourlyRate*hoursWorked;// calculate salary  based on hours and rate and send to main
 }
}
// class of contractor
class Contractor extends Employee
{
 double projectRate;// fix rate per project
 // constructor for contractor class 
 Contractor(int empID,String empName,double rate)
 {
     super(empID,empName); // Use base class  constructor for id and name
     projectRate=rate;    // Set contractor project pay  rate
 }
 @Override
 double calculateSalary()
 {
     return projectRate; }
}
public class oop_ass_q1 // PayrollSystem 
{
 public static void main(String[] args) 
 {
     // Creating object of each employee type
     FullTimeEmployee fullTime=new FullTimeEmployee(101,"ali",5000);
     PartTimeEmployee partTime=new PartTimeEmployee(102,"jafar",25,120);
     Contractor contractor=new Contractor(103,"hassan",15000);
     // Display salaries of  all the  employees
     System.out.println("Full Time Employee Salary: "+fullTime.calculateSalary());
     System.out.println("Part Time Employee Salary: "+partTime.calculateSalary());
     System.out.println("Contractor Salary is : "+contractor.calculateSalary());
 }
}
