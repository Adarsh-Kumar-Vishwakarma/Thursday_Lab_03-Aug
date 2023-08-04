// QUESTION NO. 2

// Package declaration
package Adarsh;

// Create a class named "Student" which implements the "Person" interface
public class Student implements Person {

    // Override the "speak" method declared in the "Person" interface
    @Override
    public void speak() {
        // Print a message to the console indicating it's from the "Student" class
        System.out.println("From Student Class");
        // Print a message to the console indicating the student is speaking
        System.out.println("Hello I'm a Student Speaking \n");
    }

}
