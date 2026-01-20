class Cal
{
	int a,b,c;
	int sum(int x, int y)
	{
		//a=x; b=y;
		return  x+y;
	}
	int sum(int y, int u, int c)
	{
		//c=c; a=y; b=u;
		return  y+u+c;
	}
	double sum(double k, double l)
	{
		//a=k; b=l;
		return k+l;
	}
	
}
public class Calculator1 
{
public static void main(String[] args) {
	Cal c = new Cal();
	int h=c.sum(6, 4,90);
	System.out.println(h);
	System.out.println("Sum of numbers is" + c.sum(2, 2));
	System.out.println("Sum of numbers is" + c.sum(2.3, 2.1));
	System.out.println("Sum of numbers is" + c.sum(2, 2,2));
}
}
