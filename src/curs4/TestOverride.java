package curs4;

public class TestOverride {

	public static void main(String[] args) {
		
		AngajatIar angajat = new AngajatIar();
		angajat.work();
		
		
		TesterIar tester = new TesterIar();
		tester.work();
		tester.scrieTeste();
		
		Developer developer = new Developer();
		developer.work();
		
		AngajatIar tester2 = new TesterIar();
		tester2.work();
		((TesterIar) tester2).scrieTeste();
		

		AngajatIar tester3 = new TesterIar();
		tester3.work();
		
		tester3 = new Developer();
		tester3.work();
	}

}
