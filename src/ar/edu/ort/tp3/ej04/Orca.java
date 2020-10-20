package ar.edu.ort.tp3.ej04;

import java.util.ArrayList;

public class Orca extends Animal {

	public Orca(String nombre, double peso, double tamanio, ArrayList<Habilidad> habilidades,
			Cuidador cuidador) {
		super(nombre, peso, tamanio, TipoAlimento.CALAMAR, habilidades, cuidador);
		
	}

	

}
