package curs3.mostenire;

public class TesterInheritence {

	public static void main(String[] args) {
		
		TesterAutomat tester = new TesterAutomat();
		tester.setProgrammingLanguage("Java");
		tester.setDepartament("QA");
		tester.setSeniority("Junior");
		tester.setEmail("oana@apple.com");
		tester.setName("Oana");
		
		System.out.println("Numele Angajatului este " + tester.getName() + ", face parte din departamentul " + tester.getDepartament());
	}

}
