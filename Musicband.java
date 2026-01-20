class instrument
{
	void play() 
	{
		System.out.println("taaarataa");
	}
}
class piano extends instrument
{
	void play() 
	{
		System.out.println("piano music");
	}
}
class guitar extends instrument
{
	void play() 
	{
		System.out.println("gfrrtur");
	}
} 
class Drums extends instrument
{
	void play() 
	{
		System.out.println("drum drummamm");
	}
}
public class Musicband 
{
public static void main(String[] args ) 
{
	instrument[] i= {new piano(), new guitar(), new Drums()};
	for (instrument j : i) {
		j.play();
	}
	}
}
