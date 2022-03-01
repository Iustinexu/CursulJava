package curs2;

import java.util.Scanner;

public class Tema1IfElseIf {

public static void main(String[] args) {
	
	System.out.println("Ce varsta ai?");
	
	Scanner scan = new Scanner(System.in);
	
	int varsta = scan.nextInt();
	
	if(varsta >=65) {
		
		System.out.println("Esti batran");
	}else if ((varsta>=18)&&(varsta<=64)) {
		
		System.out.println("Esti adult");
	}else if (varsta<18) {
		System.out.println("Esti minor");
		
	}

}
}