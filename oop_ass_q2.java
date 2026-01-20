// base Class
class FacultyMember
{
     int facultyID;
    String name;
    // constructor
    public FacultyMember(int facultyID,String name)
    {
        this.facultyID=facultyID;
        this.name=name;
    }
    // function to display basic information
    public void displayInfo() {
        System.out.println("Faculty ID: " + facultyID);
        System.out.println("Name: " + name);
    }
}
//  derive class  professor
class Professor extends FacultyMember 
{
     String rank;
     boolean isDepartmentChair;
 // constructor
    public Professor(int facultyID,String name,String rank,boolean isDepartmentChair) 
    {
        super(facultyID, name);
        this.rank = rank;
        this.isDepartmentChair=isDepartmentChair;
    }
    @Override
    public void displayInfo() 
    {
        super.displayInfo();
        System.out.println("Rank: " + rank);
        System.out.println("Department Chair: " + (isDepartmentChair ?"Yes":"No"));//  boolean true or false
    }
}
// derived Class for adjunct Instructors
class AdjunctInstructor extends FacultyMember
{
     String courseName;
     double fixedPayment;
// constructor
    public AdjunctInstructor(int facultyID,String name,String courseName,double fixedPayment)
    {
        super(facultyID,name);
        this.courseName=courseName;
        this.fixedPayment=fixedPayment;
    }
    @Override
    public void displayInfo() 
    {
        super.displayInfo();
        System.out.println("Course Name: " + courseName);
        System.out.println("Fixed Payment: " + fixedPayment);
    }
}
public class oop_ass_q2 //UniversityManagementSystem

{
    public static void main(String[] args)
    {
        // create objects for professor and adjunctInstructor
        Professor professor = new Professor(67857,"Dr.hassan","Assistant Professor",true);
        AdjunctInstructor adjunct = new AdjunctInstructor(89765,"mr.ali","oop",1500.0);
        // display information
        System.out.println("Professor Information:");
        professor.displayInfo();
        System.out.println();
        System.out.println("Adjunct Instructor Information:");
        adjunct.displayInfo();
    }
}
