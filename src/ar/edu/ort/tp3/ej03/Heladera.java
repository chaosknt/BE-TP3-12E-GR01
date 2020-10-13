package ar.edu.ort.tp3.ej03;

public class Heladera  extends Electrodomestico implements IFuncion{
	
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
		return super.mostrarProducto() +  mostrarTipo(noFrost) + " Capacidad: " + capacidad + " Precio: $" + super.getPrecio();
	}	
	

	
	public String mostrarTipo(boolean condicion) 
	{
		String retorno = "no Frost: No ";
		if(noFrost)
		{
			retorno = "no Frost: Si";
		}
		
		return retorno;
	}
	
	

}
