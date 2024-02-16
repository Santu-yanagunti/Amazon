package com.star.Flip;
import java.util.Scanner;

	public class Main {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter first number: ");
	        int num1 = scanner.nextInt();

	        System.out.print("Enter second number: ");
	        int num2 = scanner.nextInt();

	        Calculator calculator = new Calculator();
	        System.out.println("Sum: " + calculator.sum(num1, num2));
	        System.out.println("Subtract: " + calculator.subtract(num1, num2));
	        System.out.println("Multiply: " + calculator.multiply(num1, num2));
	        try {
	            System.out.println("Divide: " + calculator.divide(num1, num2));
	        } catch (ArithmeticException e) {
	            System.out.println("Error: " + e.getMessage());
	        }

	        scanner.close();
	    }
	}




