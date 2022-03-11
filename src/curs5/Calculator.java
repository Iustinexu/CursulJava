package curs5;

import java.util.Scanner;

public class Calculator {
	
	
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		calc.askTheUser();
		calc.calculateNumbers();
		calc.printResult();
		
	}
	
	// Calculator pt operatii de baza(+, -, *, /) cu 2 numere
	// Numerele sunt date de user
	// Operatia e data de user
	// Printam operatia matematica si rezultatul: EX: 3+5=8
	
	double num1;
	double num2;
	char calculus;
	double result;
	
	
	// Ce facem:
	// Aflam numerele si operatia
	public void askTheUser() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first number:");
		num1 = scan.nextInt();
		System.out.println("Please enter the calculus:");
		calculus = scan.next().charAt(0);
		System.out.println("Please enter second number:");
		num2 = scan.nextInt();
	}
	
	// Calculam
	
	public void calculateNumbers() {
		
		if(calculus == '+') {
			result = num1 + num2;
			
		}else if(calculus == '-') {
			result = num1 - num2;
			
		}else if(calculus == '*' || calculus == 'x') {
			result = num1 * num2;
			
		}else if(calculus == '/' || calculus == ':') {
			result = num1 / num2;
		}else { 
			System.out.println("Wrong Character");
	}
		
	}
	// Printam
	
	public void printResult() {
		System.out.println(num1 + " " + calculus + " " + num2 + " = " + result);
	}
	
	
	
	
	
	
	
	
	

}
