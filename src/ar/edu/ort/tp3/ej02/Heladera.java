package ar.edu.ort.tp3.ej02;

public class Heladera  extends Electrodomestico{
	
	private int capacidad;
	private boolean noFrost;
	
	public Heladera(String marca, String modelo, int numSerie, Voltaje tipo, Estado estado, double precio, int capacidad, boolean noFrost) {
		super(marca, modelo, numSerie, tipo, estado, precio);
		this.capacidad = capacidad;
		this.noFrost = noFrost;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public boolean isNoFrost() {
		return noFrost;
	}

	public void setNoFrost(boolean noFrost) {
		this.noFrost = noFrost;
	}

	@Override
	protected String mostrarDetalleProducto() 
	{		
		return super.mostrarProducto() +  mostrarTipoHeladera(noFrost) + " Capacidad: " + capacidad + " Precio: $" + super.getPrecio();
	}
	
	private String mostrarTipoHeladera(boolean noFrost) 
	{
		String retorno = "no Frost: No ";
		if(noFrost)
		{
			retorno = "no Frost: Si";
		}
		
		return retorno;
	}
	
	

}
