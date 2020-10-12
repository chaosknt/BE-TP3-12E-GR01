package ar.edu.ort.tp3.ej01;

public class Vendedor extends SubContratado {
	private double porcentaje;
	
	public Vendedor(String nombre, int edad, float cantHoras, float precioHora, float porcentaje) {
		super(nombre, edad, cantHoras, precioHora);
		this.porcentaje = porcentaje * 0.1;
	}
	
	@Override
	public float calcularPago() 
	{	
		return (float) ((cantHoras * precioHora) * (0.1 * porcentaje + 1)) ;
	}

}
