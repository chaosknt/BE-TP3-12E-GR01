package ar.edu.ort.tp3.ej04;

public class Habilidad {
	private String nombre;
	private double cantidadAlimento;
	
	public Habilidad(String nombre, double cantAlimento) 
	{
		this.nombre = nombre;
		this.cantidadAlimento = cantAlimento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getCantidadAlimento() {
		return cantidadAlimento;
	}

	public void setCantidadAlimento(double cantidadAlimento) {
		this.cantidadAlimento = cantidadAlimento;
	}
	
	
}
