package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] array5 = new String[5];
		//2. print the third element in the array
		System.out.println(array5[2]);
		//3. set the third element to a different value
		array5[2] = "Hello";
		//4. print the third element again
		System.out.println(array5[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for(int i = 0; i < 5; i++) {
			array5[i] = "Word";
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i < array5.length; i++) {
			System.out.print(array5[i] + " ");
		}
		System.out.println();
		//7. make an array of 50 integers
		int[] bigArray = new int[50];
		//8. use a for loop to make every value of the integer array a random number
		for(int i = 0; i < 50; i++) {
			bigArray[i] = (int) (Math.random() * 10);
		}
		//9. without printing the entire array, print only the smallest number on the array
		int smallest = 20;
		for(int i = 0; i < 50; i++) {
			if(bigArray[i] < smallest) {
				smallest = bigArray[i];
			}
		}
		System.out.println(smallest);
		//10 print the entire array to see if step 8 was correct
		for(int i = 0; i < 50; i++) {
			System.out.print(bigArray[i] + " ");
		}
		System.out.println();
		//11. print the largest number in the array.
		int largest = -1;
		for(int i = 0; i < 50; i++) {
			if(bigArray[i] > largest) {
				largest = bigArray[i];
			}
		}
		System.out.println(largest);
		//12. print only the last element in the array
		System.out.println(bigArray[49]);
	}
}
