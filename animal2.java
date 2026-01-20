class animal2 
{  
    int id = 5;
    String name = "dog";

    public void sh() {
        System.out.println("No of animals: " + id + " | Name of this animal: " + name);
    }
 public static void main(String[] args) 
    {  // Corrected main method
        animal2 a = new animal2();
        a.sh();
    }
}
