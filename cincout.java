import java.util.Scanner;
public class cincout 
{
	public static void main(String[] args)
	{
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter your id");
		int id = ss.nextInt();
		System.out.print("Student sap id is : " + id);
		ss.close();
	}
}
