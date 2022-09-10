package Week1VariablesAndOperations;

public class VariablesAndOperations 
{

	public static void main(String[] args) 
	{
		int AvailablePlaneSeats = 10;
		
		double GroceryCost = 31.69;
		
		char MiddleNameInitial = 'D';
		
		boolean IsItHotOutside = true;
		
		String FirstName = "John";
		
		String StreetAddress = "123 W Sweet Ln";
		
		System.out.println("Available plane seats = " + AvailablePlaneSeats);
		System.out.println("Cost of groceries = " + GroceryCost);
		System.out.println("Middle initial = " + MiddleNameInitial);
		System.out.println("Is it hot outside? = " + IsItHotOutside);
		System.out.println("Customers first name = " + FirstName);
		System.out.println("Street address = " + StreetAddress);
		
		AvailablePlaneSeats -= 2;
		System.out.println("Available plane seats = " + AvailablePlaneSeats);
		
		GroceryCost += 2.15;
		System.out.println("Cost of groceries = " + GroceryCost);

		MiddleNameInitial = 'R';
		System.out.println("Middle initial = " + MiddleNameInitial);

		IsItHotOutside = !IsItHotOutside;
		System.out.println("Is it hot outside? = " + IsItHotOutside);

		String FullName = FirstName + ' ' + MiddleNameInitial + " Smith";
		System.out.println("Hello my name is " + FullName + ". I live at " + StreetAddress + '.');
	}

}
