package ar.edu.ort.tp3.ej03;

import java.util.Scanner;

public class Main {	
	
	 static final Scanner in =  new Scanner(System.in);
	 
	public static void main(String[] args) {
		
		//agregar productos al stock ok
		//ver productos ok
		//falta agregar al carrito, sacar el total y mostrar ticket
		
		Productos stock = new Productos();
		Carrito carrito = new Carrito();
			
		int op;
		
		do 
		{	 
			mostrarMenuPrincipal(); 
			op = seleccionarOpcion(0,2,"Elija un numero entre 0 y 2");
			
			switch(op) 
			{
			case 0: System.out.println("Programa terminado");
			break;
			
			case 1: menuAgregarProductos();
						int producto = seleccionarOpcion(1,4,"");
						Electrodomestico ob1 = pedirDatos(producto);
						stock.agregarProducto(ob1);
					break;
			case 2: stock.getProductos();
					break;
					
					
			}
		}while(op != 0);
		
		

	}
	
	public static void clearScreen() {  
	    System.out.print("\033[H\033[2J");  
	    System.out.flush();  
	}  
	
	public static void mostrarMenuPrincipal() 
	{
		System.out.println("0.Salir - 1. Cargar productos - 2. Ver productos ");
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
	

}
