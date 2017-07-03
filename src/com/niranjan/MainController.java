package com.niranjan;

import java.util.Scanner;

public class MainController {
	static int numberToHold ;

	public static int checkNumber(int number) {// passing no to business logic

		if ((number + 10 >= 100 && number + 10 <= 120)) // checking condition
			return 1 ;
		else if ((number + 10 >= 200 && number + 10 <= 220))// checking condition
			return -1 ;
		else
			return 0 ;// else return false
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number to check the whether it is near to 100 or 200 by 10 or not....");
		Scanner scanner=new Scanner(System.in);// scanner class
		numberToHold=scanner.nextInt();
		numberToHold=MainController.checkNumber(numberToHold);//passing value to method
		if(numberToHold==1)
		System.out.println("no is near to 100");
		else if(numberToHold==-1)
			System.out.println("it is near to 200");
		else
			System.out.println("it is not near to 100 or 200");
		scanner.close();
			}

}
