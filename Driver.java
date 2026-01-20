interface Draw 
{
    void draw();
}
interface Shape extends Draw 
{
    String shapeType();
    double calculateArea();
}
class Rectangle implements Shape
{
    double length,width;
   Rectangle(double length,double width) 
    {
        this.length=length;
        this.width=width;
    }
  public void draw() 
  {
        System.out.println("Drawing Rectangle");
  }
   public String shapeType()
   {
        return "Rectangle";
    }
  public double calculateArea()
    {
        return length*width;
    }
}
class Circle implements Shape 
{
    double radius;
    double PI=3.14159265359;
    Circle(double radius)
    {
        this.radius=radius;
    }
  public void draw() 
  {
        System.out.println("Drawing Circle");
    }
   public String shapeType() 
    {
        return "Circle";
    }
   public double calculateArea()
    {
        return PI*radius*radius;
    }
}
class Square implements Shape 
{
    double length,width;

    Square(double length,double width) 
    {
        this.length=length;
        this.width=width;
    }
   public void draw() 
   {
        System.out.println("Drawing Square");
    }
  public String shapeType() 
    {
        return "Square";
    }
   public double calculateArea() 
   {
        return length*width;
    }
}
public class Driver 
{
    public static void main(String[] args) 
    {
        Shape rectangle =new Rectangle(5,7);
        Shape circle =new Circle(4);
        Shape square =new Square(6,6);
        rectangle.draw();
        System.out.println(rectangle.shapeType()+" Area "+rectangle.calculateArea());
        circle.draw();
        System.out.println(circle.shapeType()+" Area "+circle.calculateArea());
        square.draw();
        System.out.println(square.shapeType()+" Area  "+square.calculateArea());
    }
}
