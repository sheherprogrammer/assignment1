package com.example.project;

public class ProgramLauncher {
	
	
	public static int computeFibonacciNumber(int n) {
		
		if (n == 1) {
			return 0;
		}
		
		if (n == 2) {
			return 1;
		}
		
		int two_away = 0;
		int one_away = 1;
		n = n - 3;
		int sum = 0;
		
		while (n != 0) {
			sum = two_away + one_away;
			two_away = one_away;
			one_away = sum;
			n -= 1;
		}
		
		return two_away + one_away;
		
	}
	
	public static int findMedianOfThree(int[] numbers) {
		
		int temp;
		
		if (numbers[0] > numbers[1]) {
			temp = numbers[1];
			numbers[1] = numbers[0];
			numbers[0] = temp;
		}
		
		if (numbers[1] > numbers[2]) {
			temp = numbers[2];
			numbers[2] = numbers[1];
			numbers[1] = temp;
		}
		
		if (numbers[0] > numbers[1]) {
			temp = numbers[1];
			numbers[1] = numbers[0];
			numbers[0] = temp;
		}
		
		return numbers[1];
	}
	
	
	public static boolean validMultipleChoice(char choice) {
		
		if ((choice >= 'a') && (choice <= 'd')) {
			return true;
		}
		
		if ((choice >= 'A') && (choice <= 'D')) {
			return true;
		}
		
		return false;
	}

	public static void main(final String[] args) {
		System.out.println("Not the right string, tests will fail!");
	}
}

