package ar.edu.ort.tp3.ej03;

public abstract class Electrodomestico {
	
	private String marca;
	private String modelo;
	private int numSerie;
	private Voltaje tipo;
	private Estado estado;
	private double precio;
	
	public Electrodomestico(String marca, String modelo, int numSerie, Voltaje tipo, Estado estado, double precio) 
	{
		this.marca = marca;
		this.modelo = modelo;
		this.numSerie = numSerie;
		this.tipo = tipo;
		this.estado = estado;
		this.precio = precio;
	}
	
	public String getMarca()
	{
		return marca;
	}
	
	public void setMarca(String marca)
	{
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo)
	{
		this.modelo = modelo;
	}
	
	public int getNumSerie() 
	{
		return numSerie;
	}
	
	public void setNumSerie(int numSerie) 
	{
		this.numSerie = numSerie;
	}
	
	public Voltaje getTipo() 
	{
		return tipo;
	}
	
	public void setTipo(Voltaje tipo) 
	{
		this.tipo = tipo;
	}
	
	public Estado getEstado()
	{
		return estado;
	}
	
	public void setEstado(Estado estado)
	{
		this.estado = estado;
	}
	
	public double getPrecio() 
	{
		return precio;
	}
	
	public void setPrecio(double precio) 
	{
		this.precio = precio;
	}
	
	public  String mostrarProducto()
	{
		return "Producto: "+ this.getClass().getSimpleName() + " Marca: " +
						    getMarca() + " Modelo: " + getModelo();
	}
	
	protected abstract String mostrarDetalleProducto();	
	
	
	
	
	
	
	
	
	
	
}
