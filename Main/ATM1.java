package Main;										//Main Package
import Register.*;                                  //importing Register package
class ATM1											//Main class
{
    public static void main(String args[])			//Main method
    {
		System.out.println("Akshat Shah - 19BCE246");
		System.out.println("Tulsi Patel - 19BCE284");
		System.out.println("Dhara Vaghela - 19BCE289");
        Customer ob = new Customer();               //creating object for customer class
        ob.loginmenu();								//Going to login menu
    }
}