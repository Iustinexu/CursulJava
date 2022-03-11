package curs5;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		
		
		Scanner scan  =  new Scanner(System.in);
		System.out.println("Da-mi un nr :");
		
		try {
			var num =  scan.nextInt();

		}catch (Exception e) {
				System.out.println("Please enter only numeric");		}
		
		
		
		
		

		String[] primulArray = {"unu", "doi", "trei"};
		
		String[] textArray = new String[5];
		textArray[0] = "This";
		textArray[1] = " is";
		textArray[2] = " an";
		textArray[3] = " array";
		textArray[4] = "!";
		
		
		//System.out.println(primulArray[2]);
	

}
}