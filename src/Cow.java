
public class Cow {
	
	// CLASS VARIABLES
//----------------------------------------------------------------------------------//
	String number = "NA";
	int age = 0;
	boolean male = false;
	boolean female = true;
//---------------------------END OF CLASS VARIABLES-------------------------------------------------------//
	
	
	// METHODS
//----------------------------------------------------------------------------------//	
	Cow() {}
	Cow(String newNumber, int newAge, boolean gender) {
		number = newNumber;
		age = newAge;
		if (gender == true) {
			male = false;
			female = true;
		}
		else {
			male = true;
			female = false;
		}
	}
	
	public static Cow editCow(Cow temp, String newNumber, int newAge) 
	{
		// What would you like to edit?
		int editSelection = 0;
			temp.number = newNumber;

			newAge = 0;
			temp.age = newAge;
			
		return temp;
	}
	

}
