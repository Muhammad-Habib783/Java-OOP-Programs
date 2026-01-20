class Actor 
{
    void perform() 
    {
        System.out.println("Actor is performing a scene.");
    }
}
class Comedian extends Actor 
{
    @Override    
    void perform() 
    {
        System.out.println("Comedian is making the audience laugh!");
    }
}
public class Stageshow 
{
    public static void main(String[] args) 
    {
        Actor a = new Comedian();  //  parent type, child object
        a.perform();  // Output: Comedian is making the audience laugh!
    }
}
