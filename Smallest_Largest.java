// QUESTION NO. 3

// Package declaration
package Adarsh;

// Import the Scanner class from the java.util package
import java.util.Scanner;

// Create a class named "Smallest_Largest"
public class Smallest_Largest {

    // The entry point of the program
    public static void main(String[] args) {
        // Declare an integer variable "i"
        int i;

        // Create a new Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Create an integer array named "arr" with size 10
        int[] arr = new int[10];

        // Prompt the user to enter ten numbers
        System.out.println("Enter Ten Numbers");

        // Read ten integers and store them in the "arr" array
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize variables to hold the smallest and largest numbers, set both to the first element of the array
        int smallest = arr[0];
        int largest = arr[0];

        // Iterate through the array to find the smallest and largest numbers
        for (i = 0; i < arr.length; i++) {
            // Check if the current element is smaller than the current "smallest" value
            if (smallest > arr[i]) {
                // If it is, update the "smallest" value to the current element
                smallest = arr[i];
            }

            // Check if the current element is larger than the current "largest" value
            if (largest < arr[i]) {
                // If it is, update the "largest" value to the current element
                largest = arr[i];
            }
        }

        // Print the smallest and largest numbers in the array
        System.out.println("The smallest number in the given array is : " + smallest + " and the largest number is : " + largest);
    }
}
