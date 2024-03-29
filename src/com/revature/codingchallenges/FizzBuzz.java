package com.revature.codingchallenges;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number n for fizzbuzz");
		String numString = scanner.nextLine();
		int num = Integer.parseInt(numString);
		fizzBuzz(num);
		scanner.close();
	}

	static void fizzBuzz(int num) {
		for(int i = 1;i <= num;i++) {
			if (i % 15 == 0) System.out.print("Fizz Buzz");
			else if (i % 3 == 0) System.out.print("Fizz");
			else if (i % 5 == 0) System.out.print("Buzz");
			else System.out.print(i);
			if (i+1 <= num) System.out.print(", ");
			if (i % 20 == 0) System.out.println();
		}
	}

}
