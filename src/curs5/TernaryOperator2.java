package curs5;

import java.util.Scanner;

public class TernaryOperator2 {

	public static void main(String[] args) {

		
		// Program care:
		// Citeste 2 numere
		// Verifica daca sunt pozitive
		// Verifica care e cel mai mic numar
		
		
		int num1;
		int num2;
		
		Scanner scan =  new Scanner(System.in);
		System.out.println("Enter the first number : ");
		num1 = scan.nextInt();
		System.out.println("Enter the second number : ");
		num2 = scan.nextInt();
		
		String answer;
	
		  // Cazul 1 cu if else
		if(num1>0) {
			System.out.println("Num1 is positive");
			
		}else {
			System.out.println("Num1 is negative");
		
		}
		
		  // Cazul 2 cu operator Ternar
		answer = num1>0 ? "Num1 is positive" : "Num1 is negative";
		System.out.println(answer);
		
		answer = num1>0 && num2>0 ? "Both are positive" : "Both are negative";
		System.out.println(answer);
		
	
		
		
		// verifica care este cel mai mic numar
		if(num1<num2) {
			System.out.println("Num 1 is the smallest");
		}else if(num1 == num2) {
			System.out.println("Numbers are equal");
		}else {
			System.out.println("Num 2 is the smallest");
			
		}
	answer = num1==num2?"Numbers are equal":num1<num2 ? "Num 1 is the smallest" : "Num 2 is the smallest";
	
	}
	
}
