package curs5;

import java.util.Scanner;

public class TemaArrays {

	public static void main(String[] args) {
	
		
		Scanner scan  =  new Scanner(System.in);
		System.out.println("Da-mi un numar de la 1 la 12");
		int num =  scan.nextInt();
		
		
		String lunileAnului[] = new String [13];
		    lunileAnului[0] = "De la 1 la 12 te rog!";
			lunileAnului[1] = "Ianuarie";
			lunileAnului[2] = "Februarie";
			lunileAnului[3] = "Martie";
			lunileAnului[4] = "Aprilie";
			lunileAnului[5] = "Mai";		
			lunileAnului[6] = "Iunie";
			lunileAnului[7] = "Iulie";
			lunileAnului[8] = "August";
			lunileAnului[9] = "Septembrie";
			lunileAnului[10] = "Octombrie";
			lunileAnului[11] = "Noiembire";
			lunileAnului[12] = "Decembrie";
			

			try {
				
				System.out.println(lunileAnului[num]);
				
			}catch (Exception e) {
				
				System.out.println("De la 1 la 12 te rog!");
			
			}
			
			
		


		
		
		
		
	
		
	// {, "Martie", "Aprilie", "Mai", "Iusnie", "Iulie", "August", "Septembrie", "Octombrie", "Noiembrie", "Decembrie"};
				

	
		


	
			
			
			
			
			
			
		
	}
	}




	


