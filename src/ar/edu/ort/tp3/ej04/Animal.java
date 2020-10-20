package ar.edu.ort.tp3.ej04;

import java.util.ArrayList;

public abstract class Animal {
	private String nombre;
	private double peso;
	private double tamanio;
	private TipoAlimento comida;
	private Cuidador cuidador;
	private ArrayList<Habilidad> habilidades;
	
	public Animal(String nombre, double peso, double tamanio, TipoAlimento comida, ArrayList<Habilidad> habilidades, Cuidador cuidador) {
		super();
		this.nombre = nombre;
		this.peso = peso;
		this.tamanio = tamanio;
		this.comida = comida;
		this.habilidades = habilidades;
		this.cuidador = cuidador;
	}
	
	public TipoAlimento getComida() {
		return comida;
	}

		
	
	
	
}
