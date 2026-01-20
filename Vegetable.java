abstract class Sabzi
{
	abstract public void taste();
}
class bindi  extends Sabzi 
{
	public void taste()
	{
		System.out.println("Bindi taste");
	}
}
class tomato extends Sabzi
{
	public void taste()
	{
		System.out.println("tomato taste");
	}
}
public class Vegetable 
{
	public static void main(String[] args)
	{
		
		Sabzi s = new tomato();
		s.taste();
		Sabzi b = new bindi();
		b.taste();
	}

}
