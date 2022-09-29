package CSProject1;
import java.util.*;

//The parent class of the Project
public class Person {
	//Variables-------------------------------
	private String name = "";
	
	//constructor
	public Person(String initialName) {
		name = initialName;
	}	
	//writeOutput function which will then be renamed toString()
	public void writeOutput() {
		System.out.println("Name: " + name);
	}
	//checks if the two objects have the same name
	public boolean hasSameName(Person otherPerson) {
		return (this.name.equals(otherPerson.name));
	}
	
	
	//getters and setters---------------------
	//setter for set name
	public void setName(String newName) {
		name = newName;
	}
	public String getName() {
		return name;
	}
}
