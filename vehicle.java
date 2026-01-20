class vechile1 
{
    String colour;
    float speed;
    String size;
    vechile1(String colour, float speed, String size)
    {
        this.colour = colour;
        this.speed = speed;
        this.size = size;
    }
     public void car()
     {
        System.out.println(colour);
        System.out.println(speed);
        System.out.println(size);
    }
    }
class corola extends vechile1
{
	corola(String colour, float speed, String size)
    {
        super(colour, speed, size);
    }
   public void corla()
   {
    System.out.println("new model");
   }
}
public class vehicle
{
    public static void main(String [] args)
    {
    corola ca =new corola("black",120,"large");
    ca.corla();
    ca.car();
    }
}
