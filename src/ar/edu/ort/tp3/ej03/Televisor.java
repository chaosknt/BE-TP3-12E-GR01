package ar.edu.ort.tp3.ej03;

public class Televisor extends Electrodomestico implements IFuncion{
	
	private int dimension;
	private boolean esSmart;
	
	
	public Televisor(String marca, String modelo, int numSerie, Voltaje tipo, Estado estado, 
					double precio, int dimension, boolean esSmart) 
	{
		
		super(marca, modelo, numSerie, tipo, estado, precio);
		this.dimension = dimension;
		this.esSmart = esSmart;
		
	}

	public int getDimension() 
	{
		return dimension;
	}

	public void setDimension(int dimension) 
	{
		this.dimension = dimension;
	}

	public boolean isEsSmart() 
	{
		return esSmart;
	}

	public void setEsSmart(boolean esSmart)
	{
		this.esSmart = esSmart;
	}

	@Override
	protected String mostrarDetalleProducto()
	{
		return super.mostrarProducto() + " "+mostrarTipo(esSmart)+ " Pulgadas: " + dimension + " precio: $" + super.getPrecio();
	}
	
	public String mostrarTipo(boolean smart) 
	{
		String retorno = "SmartTv: No ";
		if(smart)
		{
			retorno = "SmartTv: Si ";
		}
		
		return retorno;
	}
	

}
