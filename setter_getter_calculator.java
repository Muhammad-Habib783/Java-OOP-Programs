import java.util.Scanner;
class Calculator1
 {
    private int number1;
    private double number2;
    // Getter and Setter for number1
    public int getNumber1()
     {
        return number1;
    }
    public void setNumber1(int number1) 
    {
        this.number1 = number1;
    }
    // Getter and Setter for number2
    public double getNumber2() 
    {
        return number2;
    }
    public void setNumber2(double number2) 
    {
        this.number2 = number2;
    }
    void addition()
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        setNumber1(sc.nextInt());
        System.out.println("Enter second number:");
        setNumber2(sc.nextDouble());
        double sum = (getNumber1() + getNumber2());
        System.out.println("The sum is: " + sum);
        
    }
    void subtraction() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        setNumber1(sc.nextInt());
        System.out.println("Enter second number:");
        setNumber2(sc.nextDouble());
        double diff = (getNumber1() - getNumber2());
        System.out.println("The difference is: " + diff);
        
    }
    void multiplication() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        setNumber1(sc.nextInt());
        System.out.println("Enter second number:");
        setNumber2(sc.nextDouble());
        double product = (getNumber1() * getNumber2());
        System.out.println("The multiplication is: " + product);
        
    }
    void division()
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        setNumber1(sc.nextInt());
        System.out.println("Enter second number:");
        setNumber2(sc.nextDouble());
        double division = (getNumber1() / getNumber2());
        System.out.println("The division is: " + division);
        
    }
    void addition(int a, double b)
     {
        setNumber1(a);
        setNumber2(b);
        double sum = (getNumber1() + getNumber2());
        System.out.println("The sum is: " + sum);
    }
    void subtraction(int a, double b) 
    {
        setNumber1(a);
        setNumber2(b);
        double diff = (getNumber1() - getNumber2());
        System.out.println("The difference is: " + diff);
    }
    void multiplication(int a, double b)
     {
        setNumber1(a);
        setNumber2(b);
        double product = (getNumber1() * getNumber2());
        System.out.println("The product is: " + product);
    }
    void division(int a, double b)
     {
        setNumber1(a);
        setNumber2(b);
        double divide = (getNumber1() / getNumber2());
        System.out.println("The division is: " + divide);
    }
}
public class setter_getter_calculator 
{
    public static void main(String[] args) 
    {
        Calculator1 c = new Calculator1();
        c.addition();
        c.subtraction();
        c.multiplication();
        c.division();
        c.addition(4, 12.5);
        c.subtraction(6, 2);
        c.multiplication(2, 4);
        c.division(15, 5.0);
    }
   
}
