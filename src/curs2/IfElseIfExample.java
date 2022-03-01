package curs2;

import java.util.Scanner;

public class IfElseIfExample {

	public static void main(String[] args) {
	
		System.out.println("Ce Punctaj ai obtinut?");
		Scanner scan = new Scanner(System.in);
		int punctaj = scan.nextInt();
		char calificativ;
		
		if(punctaj<=60) {
			calificativ = 'E';
		}else if(punctaj<=70){
			calificativ = 'D';
		}else if(punctaj<=80){
			calificativ = 'C';
		}else if(punctaj<=90){
			calificativ = 'B';
		}else {
			calificativ = 'A';
		}
		
		
		System.out.println("Calificativul primit este: "+ calificativ);
		
	}

}
