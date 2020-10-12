package ar.edu.ort.tp3.ej01;

public class Asalariado extends Empleado{
	private float sueldo;
	
	public Asalariado(String nombre, int edad, float sueldo)
	{
		super(nombre,edad);
		this.sueldo = sueldo;
	}
	
	public void setSueldo(float sueldo) 
	{
		this.sueldo = sueldo;
	}
	
	@Override
	public float calcularPago()
	{
		return sueldo;
	}

	@Override
	public String toString() 
	{
		return  this.getClass().getSimpleName() + " de nombre " + super.getNombre() 
				+ " edad " + super.getEdad() + " gana " + calcularPago();
		
	}
	
	
	
}
