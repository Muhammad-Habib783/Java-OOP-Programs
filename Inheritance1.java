class person
{
    String personname="Ali";
    String age="17";
    void print()
    {
          System.out.println("The person name is "+personname);
         System.out.println("The person age is "+age);
    }
}
class Patient extends person
{
    String diseasetype="Cough";
    String recommendedmedicine="antibiotics"; 
    void print()
    {
     super.print();
          System.out.println("The Disease Type is "+diseasetype);
            System.out.println("The Recommended Medicine is "+recommendedmedicine);
    }
}
class medicarepatient extends person
{
    String hospitalname="QH";
    String wardname="ANATOMY";
        String roomnumber="B12";
     void print(){
       super.print();
          System.out.println("The Hospital Name is "+hospitalname);
            System.out.println("The Ward Name is "+wardname);
             System.out.println("The Room Number is "+roomnumber);
    }
}
class Main3
 {
    public static void main(String[] args)
     {
       person s= new Patient();
       s.print();
         person d= new medicarepatient();
       d.print();
    }
}
