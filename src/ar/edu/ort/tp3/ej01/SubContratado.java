package ar.edu.ort.tp3.ej01;

public class SubContratado extends Empleado {
	public float cantHoras;
	public float precioHora;
	
	public SubContratado(String nombre, int edad, float cantHoras, float precioHora) 
	{
		super(nombre, edad);
		this.cantHoras = cantHoras;
		this.precioHora = precioHora;
	}

	public float getCantHoras() {
		return cantHoras;
	}

	public void setCantHoras(float cantHoras) {
		this.cantHoras = cantHoras;
	}

	public float getPrecioHora() {
		return precioHora;
	}

	public void setPrecioHora(float precioHora) {
		this.precioHora = precioHora;
	}
		
	@Override
	public float calcularPago() 
	{
		return precioHora * cantHoras;
	}
	
	@Override
	public String toString() 
	{
		return  this.getClass().getSimpleName() + " de nombre " + super.getNombre() 
				+ " edad " + super.getEdad() + " gana " + calcularPago();
		
	}
	
	
	
}
