package ar.edu.ort.tp3.ej03;

public class Lavarropas extends Electrodomestico implements IFuncion{
	
	private int cargaMaxima;
	private boolean semiAutomatico;

	public Lavarropas(String marca, String modelo, int numSerie, Voltaje tipo, 
			Estado estado, double precio, int cargaMaxima, boolean semiAutomatico) 
	{
		super(marca, modelo, numSerie, tipo, estado, precio);
		
		this.cargaMaxima = cargaMaxima;
		this.semiAutomatico = semiAutomatico;
		
	}

	public int getCargaMaxima() {
		return cargaMaxima;
	}

	public void setCargaMaxima(int cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}

	public boolean isSemiAutomatico() {
		return semiAutomatico;
	}

	public void setSemiAutomatico(boolean semiAutomatico) 
	{
		this.semiAutomatico = semiAutomatico;
	}

	@Override
	protected String mostrarDetalleProducto() 
	{
		return super.mostrarProducto() + mostrarTipo(semiAutomatico)+ " Carga maxima: " + cargaMaxima + " precio: $" + super.getPrecio();
	}
	
	public String mostrarTipo(boolean semiAutomatico) 
	{
		String retorno = "Semi automatico: No ";
		if(semiAutomatico)
		{
			retorno = "Semi automatico: Si ";
		}
		
		return retorno;
	}
	

}
