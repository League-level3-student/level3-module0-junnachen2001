package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] arr = {"a", "b", "c", "d", "e"};
		randomStrings(arr);
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	public static void randomStrings(String[] array) {
		for(int i = 0; i < array.length; i++) {
			int random = (int) (Math.random() * array.length);
			if(array[random] == null) {
				i--;
			}
			if(array[random] != null) {
				System.out.print(array[random]);
			}
			array[random] = null;
		}
	}
	
}
