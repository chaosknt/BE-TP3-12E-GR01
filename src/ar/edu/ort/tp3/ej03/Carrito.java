package ar.edu.ort.tp3.ej03;

import java.util.ArrayList;

public class Carrito {
	
	private double totalCompra;
	private ArrayList<Electrodomestico> carrito;
	
	public Carrito() 
	{
		carrito = new ArrayList<Electrodomestico>();
		totalCompra = 0;
		
	}
	
	
	public void agregarProducto(Electrodomestico e) 
	{
		carrito.add(e);
	}
	
	private void calcularTotal() 
	{
		for(Electrodomestico p: carrito) 
		{
			totalCompra+= p.getPrecio();
			System.out.println(p.mostrarDetalleProducto());
		}
	}
	
	public void getTotalCompra() 
	{
		System.out.println("Ticket de venta");
		System.out.println("Articulos:");
		calcularTotal();
		System.out.println("total de la compra: $" + totalCompra);
	}
	
}
