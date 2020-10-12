package ar.edu.ort.tp3.ej01;

public abstract class Empleado {
	private String nombre;
	private int edad;
	
	public Empleado(String nombre, int edad) 
	{
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public String getNombre() 
	{
		return nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public int getEdad() 
	{
		return edad;
	}
	
	public void setNonbre(int n) 
	{
		edad = n;
	}

	@Override
	public String toString() 
	{
		return "Empleado [nombre=" + nombre + ", edad=" + edad ;
	}
	
	public float calcularPago() {return 0.0f;};
	
	

}
