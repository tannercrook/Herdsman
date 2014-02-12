
public class Pen extends Cow {
	
	// CLASS VARIABLES
	String name = "Untitled";
	int size = 10;
	Cow cows[] = new Cow[size];
	
	// METHODS
	
	//Constructors
	Pen() {}
	Pen(String newName, int newSize, Cow[]newList) {
		name = newName;
		size = newSize;
		for (int i = 0; i < size; i++) {
			cows[i] = newList[i];
		}
	}
}
