public class Over1
 {

    // Method 1
    void sendMessage() 
    {
        System.out.println("Mesaage sent....");
    }
    // Method 2
    void sendMessage(String name) 
    {
    	 System.out.println("Mesaage sent to"+ name);
    }
    // Method 3
    void sendMessage(String name, String message)
    {
    	System.out.println("message sent to" +name +message);
    }
    public static void main(String[] args) 
    {
    	Over1 m = new Over1();// student s = new student(); s.
        m.sendMessage();
        m.sendMessage("Ali");
        m.sendMessage("Sana", "Hello! chath py aa jao");
    }
}
