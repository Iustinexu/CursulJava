package curs4;

public class Rectangle1 {

	//variabile - scris cu litera mica - nu au nimic dupa ele
	//private --> sunt disponibile doar in interiorul clasei in care se afla
	
	private int length;
	private int width;
	
	//constructorul scris de noi sau automat de Java
	public Rectangle1() {}
	//constructor cu parametrii 
	public Rectangle1(int num1, int num2) {
		setLength(num1); //method call
		setWidth(num2);
	}
	
	
	
	//getter - metode specifice care returneaza valoarea unei variabile privata
	public int getLength() {
		return length;
	}
	//getter - metode specifice care seteaza valoarea unei variabile privata
	private void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	private void setWidth(int width) {
		this.width = width;
	}
	
	//metoda java
	//void --> nu returneaza nimic
	// metoda asta va fi chemata asa: numeObj.calculeazaAria(); --> type este obiect
	public void calculeazaAria() {
		System.out.println("Aria este "+ length*width);
	}
	
	
	//metoda java
	//return int
	//metoda asta va fi chemata: numeObj.calculeazaPerimetru(); --> type este int
	//la executia numeObj.calculeazaPerimetru() = return(2*length) + (2*width);
	public int calculeazaPerimetru() {
		return(2*length) + (2*width);
		
	}
	}
	
	
	
	
	

