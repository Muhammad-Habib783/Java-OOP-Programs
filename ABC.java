public class ABC
 {
	int x,y;
	ABC(int g, int h)
	{
		x= g;
		y=h;
	}
	public void sum()
	{
		int z=x+y;
		System.out.println(z);
		//System.out.print(z);
	}

	public static void main(String [] args) 
	{
		ABC obj = new ABC(4,4);
		//obj.x=4;
		//obj.y=5;
		obj.sum();
		
		int a =5;
		int b= 6;
		int c = a+b;
		System.out.println(c);
	}
}
