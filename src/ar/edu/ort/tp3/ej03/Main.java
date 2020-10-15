package ar.edu.ort.tp3.ej03;

import java.util.Scanner;

public class Main {	
	
	 static final Scanner in =  new Scanner(System.in);
	 
	public static void main(String[] args) {
		
		//al ser un ejercicio basado en herencia y polimorfismo, no se trabajo tanto con las validaciones
		// ya que no es el objetivo central de este ejercicio
		
		Productos stock = new Productos();
		Carrito carrito = null;
		int producto;			
		int op;
		
		do 
		{	 
			mostrarMenuPrincipal(); 
			op = seleccionarOpcion(0,3,"Elija un numero entre 0 y 2");
			
			switch(op) 
			{
			case 0: System.out.println("Programa terminado");
			break;
			
			case 1: menuAgregarProductos();
						producto = seleccionarOpcion(1,4,"");
						Electrodomestico ob1 = pedirDatos(producto);
						stock.agregarProducto(ob1);
					break;
					
			case 2: 
				
			if(stock.size()>0) 
			{
				carrito = realizarCompra(stock);
			}else {
				System.out.println("No hay productos cargados");
			}
				
				break;			
								
								
			}
			
		}while(op != 0);
		
				
		carrito.getTotalCompra();

	}	
	
	public static void mostrarMenuPrincipal() 
	{
		System.out.println("0.Salir - 1. Cargar productos - 2. Ver productos");
	}
	
	public static int seleccionarOpcion(int piso, int techo, String mensaje)
	{
		int retorno = -1;		
		
		while(retorno < piso || retorno > techo) 
		{
			System.out.println(mensaje);
			retorno = in.nextInt();
		}
		
		return retorno;
	}
	
	public static String pedirString(String mensaje) 
	{
		System.out.println(mensaje);
		return in.next();
	}
	
	public static int pedirEntero(String mensaje) 
	{
		System.out.println(mensaje);
		return Integer.parseInt(in.next());
	}
	
	public static double pedirDouble(String mensaje) 
	{
		System.out.println(mensaje);
		return Double.parseDouble(in.next());
	}	
	
		
	public static void menuAgregarProductos() 
	{
		System.out.println("Elija un producto");
		System.out.println("1.Televisor - 2.Lavarropa - 3. Heladera - 4.Licuadora");
	}
	
	public static boolean pedirLogico(String mensaje) 
	{
		boolean retorno = false;
		int op = pedirEntero(mensaje);
		
		if(op == 1) 
		{
			retorno = true;
		}
		return retorno;
	}
	
	public static Electrodomestico pedirDatos(int electrodomestico)
	{
		//esta funcion solo se dedica a pedir los datos para crear los objetos. Idealmente habria que validar esos datos
		//pero por cuestion de tiempo se asume que el usuario no va ingresar datos incorrectos
		
		Electrodomestico retorno = null;
		
		String marca = pedirString("ingrese la marca");
		String modelo = pedirString("Ingrese el modelo");
		int numSerie = pedirEntero("Ingrese un numero de serie");
		Voltaje tipo = Voltaje.values()[seleccionarOpcion(0,1,"Seleccione el voltaje: 0: Americano (110) - 1 Europe(220)")]; 
		double precio = pedirDouble("Ingrese el precio");
	    
	    return retorno = crearElectrodomestico(electrodomestico, marca, modelo, numSerie, tipo, precio);
	   
	}
	
	
	public static Electrodomestico crearElectrodomestico(int elec, String marca, String modelo, int num, Voltaje tipo, double precio) 
	{	
		Electrodomestico retorno = null;
		Estado estado = Estado.APAGADO;
		
		switch(elec) 
		{
		case 1: int pulgadas = pedirEntero("Ingrese pulgadas");
				boolean smart = pedirLogico("Es smart? 1.- Si | 2.- No");
				retorno = new Televisor(marca, modelo, num, tipo, estado, precio, pulgadas, smart);
		break;
		
		case 2: int carga = pedirEntero("Ingrese la carga maxima");
				boolean automatico = pedirLogico("Es semi automatico?, 1.- Si | 2.- No");
				retorno = new Lavarropas(marca, modelo, num, tipo, estado, precio, carga, automatico);
		break;
		
		case 3: int capacidad =  pedirEntero("Ingrese la capacidad");
				boolean noFrost = pedirLogico("Es no frost?, 1.- Si | 2.- No");
				retorno = new Lavarropas(marca, modelo, num, tipo, estado, precio, capacidad, noFrost);
		break;
		
		case 4: int potencia = pedirEntero("Ingrese la potencia");
				int velocidades = pedirEntero("Ingrese las velocidades");
				retorno = new Licuadora (marca, modelo, num, tipo, estado, precio, potencia, velocidades);
		break;
		}
		
		return retorno;
	}
	
	public static Carrito realizarCompra(Productos stock) 
	{
		int opcion = 1;
		int producto;
		Carrito carrito = new Carrito();
		
		while(opcion ==  1)
		{
			
			stock.getProductos();	
			producto = seleccionarOpcion(0,stock.size(),"Elija un producto para ver detalladamente");
			System.out.println(stock.devolverProducto(producto).mostrarDetalleProducto());
			opcion = seleccionarOpcion(0,1,"Agregar al carrito? 1.- Si | 0.- No");
			
			if(opcion == 1)
			{
				carrito.agregarProducto(stock.devolverProducto(producto));
			}
			
			opcion = seleccionarOpcion(0,1,"seguir comprando? 1.- Si | 0.- No");
			
		}
		
		return carrito;
	}
	

}
