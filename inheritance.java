public class inheritance
{
	public static void main(String[] args)
	{
        A objA = new A();
        B objB = new B();
        
        objA.display();
        objB.show();

}
	}
class A 
{
	int a= 554;
    void display() 
    {
        System.out.println("Class A");
    }
}
class B extends A
 {
    void show()
    {
        System.out.println("Class B in A class value is" + a);
    }
}
class C extends B
 {
	 int x= a;
 }



