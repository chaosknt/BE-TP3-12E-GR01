package ar.edu.ort.tp3.ej03;

public class Licuadora extends Electrodomestico{
	
	private int potencia;
	private int velocidades;

	public Licuadora(String marca, String modelo, int numSerie, Voltaje tipo, Estado estado, 
					double precio, int potencia, int velocidades) {
		super(marca, modelo, numSerie, tipo, estado, precio);
		this.potencia = potencia;
		this.velocidades = velocidades;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getVelocidades() {
		return velocidades;
	}

	public void setVelocidades(int velocidades) {
		this.velocidades = velocidades;
	}	

	@Override
	protected String mostrarDetalleProducto() 
	{		
		return super.mostrarProducto() + " Potencia: " + potencia + " Velocidades: " + velocidades + " Precio: $" + super.getPrecio();
	}

	
	
	
	

}
