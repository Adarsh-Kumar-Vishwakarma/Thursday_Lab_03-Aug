// QUESTION NO. 2

// Package declaration
package Adarsh;

// Create a class named "Teacher" which implements the "Person" interface
public class Teacher implements Person{

	// Override the "speak" method declared in the "Person" interface
	@Override
	public void speak() {
		// Print a message to the console indicating it's from the "Teacher" class
		System.out.println("From Teacher Class");
		// Print a message to the console indicating the teacher is speaking
		System.out.println("Hello I'm a Teacher Speaking");		
	}

}
