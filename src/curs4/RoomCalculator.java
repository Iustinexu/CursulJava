package curs4;

public class RoomCalculator {

	public static void main(String[] args) {
	
		Rectangle1 obiect = new Rectangle1();
		obiect.calculeazaAria();
		obiect.calculeazaPerimetru();
		
		//System.out.println(obiect.calculeazaAria());
		System.out.println(obiect.calculeazaPerimetru());
		
		Rectangle1 obiect2 = new Rectangle1(3,2);
		obiect2.calculeazaAria();
		System.out.println(obiect2.calculeazaPerimetru());
		
	}

}
