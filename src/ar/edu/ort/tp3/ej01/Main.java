package ar.edu.ort.tp3.ej01;

public class Main {
	public static void main(String[] args) {		
	
	Empleado empl = new Asalariado("Jose", 30, 102);
	
	System.out.println(empl);
	
	Empleado empl2 = new SubContratado("Carlos", 23, 50, 100);
	
	System.out.println(empl2);
	
	
	}
}
