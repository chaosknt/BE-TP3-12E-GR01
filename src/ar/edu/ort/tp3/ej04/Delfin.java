package ar.edu.ort.tp3.ej04;

import java.util.ArrayList;

public class Delfin extends Animal{
	
	private Entrenador entrenador;
	
	public Delfin(String nombre, double peso, double tamanio, ArrayList<Habilidad> habilidades,
			Cuidador cuidador, Entrenador entrenador) {
		super(nombre, peso, tamanio, TipoAlimento.PULPO, habilidades, cuidador);
		this.entrenador = entrenador;
	}

	
	

	@Override
	public String toString() {
		return "Animal:"+ getTipo() +" [entrenador=" + entrenador + "]";
	}
	
	public String getTipo() 
	{
		return "Delfin";
	}
		
	

	
	
	

}
