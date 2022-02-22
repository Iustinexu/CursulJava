package curs1;

public class ExampleVariables {

	static String greetings = "Numele meu este: "; // Variabila statica - poate fi chemata fara obiect, nu are nevoie de obiect
	
	
	
	
	String prenume = "Oana";//instance variable - am nevoie de un obiect al clasei pt a o accesa
	
	//metoda main - metoda principala de executie
	public static void main(String[] args) {
		
		// obiectul clasei care imio permite sa accesez variabilele si metodele din clasa respectiva
		ExampleVariables numeObiect = new ExampleVariables();
		
		
		//System.out.println(numeObiect.prenume);
		//numeObiect.printNume();

		//System.out.println(greetings);
		
		System.out.println(greetings + numeObiect.printNume());
		
		
	}
	
	
	public String printNume () {
		String nume = "Ion "; // local variable
		return nume + prenume;
		
	}
}
