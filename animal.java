public class animal 
{

	public static void main(String[] args)
	{
		rat d = new rat();
		d.bark();
		d.eat();

	}

}
class minaL
{
	void eat()
	{
		System.out.println("eating...");
	}
}
class rat extends minaL 
{
	void bark()
	{
		System.out.println("barking");
	}
}


