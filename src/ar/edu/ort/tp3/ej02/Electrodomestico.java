package ar.edu.ort.tp3.ej02;

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
	
	protected String getMarca()
	{
		return marca;
	}
	
	protected void setMarca(String marca)
	{
		this.marca = marca;
	}
	
	protected String getModelo() {
		return modelo;
	}
	
	protected void setModelo(String modelo)
	{
		this.modelo = modelo;
	}
	
	protected int getNumSerie() 
	{
		return numSerie;
	}
	
	protected void setNumSerie(int numSerie) 
	{
		this.numSerie = numSerie;
	}
	
	protected Voltaje getTipo() 
	{
		return tipo;
	}
	
	protected void setTipo(Voltaje tipo) 
	{
		this.tipo = tipo;
	}
	
	protected Estado getEstado()
	{
		return estado;
	}
	
	protected void setEstado(Estado estado)
	{
		this.estado = estado;
	}
	
	protected double getPrecio() 
	{
		return precio;
	}
	
	protected void setPrecio(double precio) 
	{
		this.precio = precio;
	}
	
	protected  String mostrarProducto()
	{
		return "Producto: "+ this.getClass().getSimpleName() + " Marca: " +
						    getMarca() + " Modelo: " + getModelo();
	}
	
	protected abstract String mostrarDetalleProducto();
	
	
	
	
	
	
	
	
	
	
}
