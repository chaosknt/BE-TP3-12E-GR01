package ar.edu.ort.tp3.ej03;

import java.util.ArrayList;

public final class Productos {
			
	private ArrayList<Electrodomestico> productos;
	
	public Productos() {
		productos = new ArrayList<Electrodomestico>();
	}
	
	public void getProductos() 
	{
		if(productos.size() > 0)
		{		
		
			for(int i = 0; i < productos.size(); i++) 
			{
				System.out.println(i + " - " + productos.get(i).mostrarProducto());
			}
			
		}else {
			System.out.println("No se han agregado productos");
		}
	}
	
	public void agregarProducto(Electrodomestico e) 
	{
		productos.add(e);
	}
	
	public void eliminarProducto(Electrodomestico e) 
	{
		productos.remove(e);
	}
	
	public int size() 
	{
		return productos.size();
	}
	
	public Electrodomestico devolverProducto(int i) 
	{
		return productos.get(i);
	}
}
