package curs2;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		
		
		System.out.println("Intro Calificativul Primit: ");
		Scanner scan = new Scanner(System.in);
		String calificativ = scan.next();
		
		switch(calificativ) {

		case "A" : 
			System.out.println("Bine Boss");
			break;
		case "B" :
			System.out.println("Nu prea frate");
			break;
		case "C" :
			System.out.println("Urit");
			break;
		default:
			System.out.println("Pune si tu A, B, C");
		}
		
		
				
				

	}

}
