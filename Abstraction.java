abstract class  Mark
{
	abstract double getPercentage();
}
class studentA extends Mark
{
	double total;
  studentA(int s1,int s2,int s3)
  {
	  total=s1+s2+s3;
  }
	double getPercentage()
	{
		double percentage=(total/300)*100;
		return percentage;	
	}
}
class studentB extends Mark
{
	double total;
	 studentB(int s1,int s2,int s3,int s4)
	  {
		 total=s1+s2+s3+s4;
	  }
	double getPercentage()
	{
		double percentage=(total/400)*100;
		return percentage;	
	}
}
public class Abstraction
{
	public static void main(String[] args)
	{
		Mark sa =new studentA(70,80,60);
		Mark sb =new studentB(70,40,60,70);
		
		System.out.println("The percentage of student A is "+sa.getPercentage());
		System.out.println("The percentage of student B is "+sb.getPercentage());		
	}
}
