package curs2;

import java.util.Scanner;

public class Tema1 {

	public static void main(String[] args) {
		System.out.println("Ce nota ati obtinut la test:");
		Scanner scan = new Scanner(System.in);
		int nota = scan.nextInt();
		
		if(nota <=6) {
			System.out.println("Ai picat. Mai incearca");
			
		}else {
			System.out.println("Felicitari. Ai trecut!");
		}
	}

}
