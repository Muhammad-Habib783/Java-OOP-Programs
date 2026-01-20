import java.util.Scanner;
class Calculator1
{
	void addition()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number :");
		int a = sc.nextInt();
		System.out.println("Enter second number:");
		double b = sc.nextDouble();
		double sum = (a+b);
		System.out.println("The sum is: " + sum);	
		sc.close();
	}
	void subtraction()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number :");
		int a = sc.nextInt();
		System.out.println("Enter second number:");
		double b = sc.nextDouble();
		double diff = (a-b);
		System.out.println("The difference is: " + diff);	
		sc.close();
	}
	void multiplication()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number :");
		int a = sc.nextInt();
		System.out.println("Enter second number:");
		double b = sc.nextDouble();
		double product = (a*b);
		System.out.println("The multiplication   is: " + product);	
		sc.close();
	}
	void division()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number :");
		int a = sc.nextInt();
		System.out.println("Enter second number:");
		double b = sc.nextDouble();
		double division = (a/b);
		System.out.println("The division  is: " + division);
		sc.close();
	}
	void addition(int a,double b)
	{
		int p=a;
		double g=b;
		double sum=(p+g);
		System.out.println("The sum is: " + sum);	
	}
	void subtraction(int a,double b)
	{
		int p=a;
		double g=b;
		double diff=(p-g);
		System.out.println("The difference is: " + diff);	
	}
	void multiplication(int a,double b)
	{
		int p=a;
		double g=b;
		double product=(p*g);
		System.out.println("The product is: " + product);	
	}
	void division(int a,double b)
	{
		int p=a;
		double g=b;
		double divide=(p/g);
		System.out.println("The division is: " + divide);	
	}	
}
public class Calculator 
{
	public static void main(String[] args)
	{
		Calculator1 c = new Calculator1();
		c.addition(4,12.5);
		c.subtraction(6, 2);
		c.multiplication(2, 4);
		c.division(15,5.0 );
		c.addition();
		c.subtraction();
		c.multiplication();
		c.division();	
	}
}
