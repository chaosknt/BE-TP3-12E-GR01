package ar.edu.ort.tp3.ej01;

public class Main {
	public static void main(String[] args) {		
			
	Empleado [] empleados = {
			new Asalariado("Jose", 30, 10000),
			new SubContratado("Carlos", 23, 50, 100),
			new Vendedor("Pedro", 25, 100, 200, 5),
			new Vendedor("Maria", 30, 100, 200, 10)
	};
	
	for(Empleado e : empleados)
	{
		System.out.println(e);
	}
	
	}
}
