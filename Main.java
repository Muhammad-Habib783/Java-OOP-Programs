public class Main
{
    public static void main(String[] args)
    {
     computer c = new Laptop();
     c.show("black",5.7f,5.6f,"ABC");
    }
}
class computer 
{
    String company_name;
    int price;
    void show(String a,float s,float w,String p)
    {
    System.out.println(" Company name " + a );
    System.out.println(" Price " + s);
    }
}
class Desktop extends computer 
{
    String color;
    float monitorsize;
    String processortype;
void show(String a,float s,float w,String p)
{
      color=a;
     monitorsize=s;
     processortype=p;
System.out.println(" Color " + color);
System.out.println(" The moitor size will be " + monitorsize);
System.out.println(" The processor type will be " + processortype);
}
}
class Laptop extends computer
{
  String color1;
  float size;
  float weight;
  String processortype;
  void show(String a,float s,float w,String p)
{
System.out.println(" Color " + a);
System.out.println(" The  size will be " + s);
System.out.println(" The  weight will be " + w);
System.out.println(" The processor type will be " + p);
}
}
