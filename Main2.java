public class Main2
 {
    public static void main(String[] args) 
    {
        Person p = new Patient();
        p.print("QH","ANATOMY","B12");
    }
}
class Person
{
    void print(String a,String b,String c)
    {
        String PersonName=a;
        String age=b;
        System.out.println(" The person name is " + PersonName);
        System.out.println(" The age is " + age);
    }
}
class Patient extends Person 
{
    String diseasetype;
    String recommendedMedicine;
    void print(String a,String b,String c)
    {
        diseasetype=a;
        recommendedMedicine=b;
     System.out.println(" Disease type is " + diseasetype);   
    System.out.println("  Recommended medicine is " + recommendedMedicine);
        
    }
}
class MedicarePatient extends Patient
{
    String name_of_hospital;
    String name_of_ward;
    String room_number;
    void print(String a,String b,String c)
    {
      name_of_hospital=a;
      name_of_ward=b;
      room_number=c;
     System.out.println(" Hospital name is  " +  name_of_hospital);
     System.out.println(" Ward name is " + name_of_ward);
     System.out.println(" Room numbe is " +  room_number);
    }
} 
