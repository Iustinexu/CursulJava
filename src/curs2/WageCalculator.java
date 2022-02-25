package curs2;

public class WageCalculator {

	int hoursWorked = 40;
	
	public static void main(String[] args) {
		
		Tester tester1 = new Tester ();
		tester1.setName("Oana");
		tester1.setRatePerHour(30);
		
		WageCalculator obiect = new WageCalculator();
		
		System.out.println(tester1.getName());
		System.out.println("Salariul lui " + tester1.getName() + " este " + obiect.calculateSalary(tester1.getRatePerHour()));
		
		
		
		
		Tester tester2 = new Tester ();
		tester2.setName("Maria");
		tester2.setRatePerHour(40);
		
		
		System.out.println(tester2.getName());
		System.out.println("Salariul lui " + tester2.getName() + " este " + obiect.calculateSalary(tester2.getRatePerHour()));
				

	}
	
	public int calculateSalary(int plataPeOra) {
		
		int salary = plataPeOra * hoursWorked;
		
		return salary;
		
	}

}
