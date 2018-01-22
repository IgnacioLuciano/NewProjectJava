package com.project.ignacio;

import java.util.Scanner;

public class Startup {

	public static void main(String[] args) {

		System.out.println("Task Manager");
		System.out.println("Task 1");
		System.out.println("Task 2");
		System.out.println("Task 3");
		System.out.println("Task 4");
		System.out.println("Enter a number from 1 to 4");
		
		
		int number = 0;
		Scanner scan = new Scanner(System.in);
		number=scan.nextInt();
		
		if (number == 1) {
			System.out.println("Todo 1");
			int scan1 = scan.nextInt();
		} 
		
		else if(number == 2) {
			System.out.println("Todo 2");
			int scan1 = scan.nextInt();
		}
		else if (number == 3) {
			System.out.println("Todo 3");
			Scanner scan3 = new Scanner(System.in);
		}	
		else if (number == 4) {
				System.out.println("Todo 4");
				Scanner scan4 = new Scanner(System.in);
		}
		else {
			System.out.println("Insert only numbers from 1 to 4");
		}
			

}
}
