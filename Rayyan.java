class black
{
	void sm(int a, int b) 
	{
		int c= a+b;
		System.out.println("pure integer" +c);
	}
	void sm(int a, int s, int b)
	{
		int j= a+s+b;
		System.out.println(j);
	}
	void sm(int a,double u)
	{
		double d= a+u;
		System.out.println("double and int mix" + d);
	}
	void sm(double a, int u)
	{
		double d= a+u;
		System.out.println("double and int mix" + d);
	}
}
public class Rayyan
{
	public static void main(String[] args)
	{
		black k = new black();
		k.sm(1, 4);
		k.sm(4, 20.5);
	}

}