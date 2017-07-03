package com.niranjan1;

import java.util.Scanner;

public class ControllerOfSudoku {
	public static void main(String args[]) {
		int size;
		boolean value = false;
		Scanner scanner = new Scanner(System.in); // scanner class
		System.out.println("enter size of your sudoku");
		size = scanner.nextInt(); // Input from user
		int[][] array = new int[size * size][size * size]; // array declaration
		System.out.println("enter sudoku elements..."); // inserting elements to
														// array

		for (int i = 0; i < size*size; i++) {
			for (int j = 0; j < size*size; j++) {
				try {
					array[i][j] = scanner.nextInt();
				} catch (NumberFormatException ne) {
					System.out.println("please enter only numbers");
					main(null);
				}
			}
		}
		ValidateSudoku ob = new ValidateSudoku(); // creating object for
													// ValidateSudoku class
		value = ob.validateSudoku(array); // Passing array value to function
		if (value == true)
			System.out.println("valid sudoku");
		else
			System.out.println("in valid sudoku");
		scanner.close();

	}

}
