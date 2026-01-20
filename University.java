class Student
{
	void register()
	{
		System.out.println("The Student Name is Ali ");
		System.out.println("The Student Age  is 18 ");
		System.out.println("The Student Department is Computer Science ");
	}
	void register(String name)
	{
		System.out.println("The Student Name is " + name);
		System.out.println("The Student Age  is 19 ");
		System.out.println("The Student Department is Artificial Intelligence ");
}
	void register(String name,int age)
	{
		System.out.println("The Student Name is " + name);
		System.out.println("The Student Age  is  " + age);
		System.out.println("The Student Department is Information Technology ");
	}
	void register(String name,int age,String department)
	{
		System.out.println("The Student Name is " + name);
		System.out.println("The Student Age  is  " + age);
		System.out.println("The Student Department is  " + department);
	}
	double gradetoGPA(String grade)
	{
        if(grade.equals("A")) 
        	return 4.0;
        if(grade.equals("A-")) 
        	return 3.7;
        if(grade.equals("B+")) 
        	return 3.3;
        if(grade.equals("B")) 
        	return 3.0;
        if(grade.equals("B-")) 
        	return 2.7;
        if(grade.equals("C+")) 
        	return 2.3;
        if(grade.equals("C")) 
        	return 2.0;
        if(grade.equals("D"))
        	return 1.0;
        else
        return 0.0;
    }
    double calculateGPA() 
    {
        String subject1="A";
        String subject2="B+";
        String subject3="A-";
        String subject4="B";
        String subject5="C+";
        String subject6="B";
        double total=gradetoGPA(subject1)+gradetoGPA(subject2)+gradetoGPA(subject3)+gradetoGPA(subject4)+gradetoGPA(subject5)+gradetoGPA(subject6);
        return total/6;
    }
}
class GraduateStudent extends Student
{
	@Override
    double calculateGPA()
	{
        String subject1="A";
        String subject2="A-";
        String subject3="B+";
        String subject4="A";
        String subject5="A";
        String subject6="B+";
        double total=gradetoGPA(subject1)+gradetoGPA(subject2)+gradetoGPA(subject3)+gradetoGPA(subject4)+gradetoGPA(subject5)+gradetoGPA(subject6);
return total/6;
    }
}
public class University
{
public static void main(String[] args)
{       
   Student s=new Student();
	s.register();
	s.register("Hassan");
	s.register("Asad",18);
	s.register("Daniyal",17,"Cyber Security");
	System.out.println("Student GPA: " + s.calculateGPA());
    GraduateStudent g=new GraduateStudent();
	System.out.println("Graduate Student GPA: " + g.calculateGPA());	
}
}

