// QUESTION NO. 2

// Package declaration
package Adarsh;

// Create a class named "Student_Teacher_Main"
public class Student_Teacher_Main {

    // The entry point of the program
    public static void main(String[] args) {
        // Create a new "Student" object
        Student sd = new Student();
        // Create a new "Teacher" object
        Teacher th = new Teacher();
        // Call the "speak" method on the "Student" object
        sd.speak();
        // Call the "speak" method on the "Teacher" object
        th.speak();
    }

}

