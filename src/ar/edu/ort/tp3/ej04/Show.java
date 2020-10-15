package ar.edu.ort.tp3.ej04;

import java.util.ArrayList;

public class Show {
	
	private ArrayList<Animal> participantes;
	private ArrayList<Alimento> alimento;
	
	public Show(ArrayList<Animal> participantes) 
	{
		this.participantes = participantes;
		agregarAlimento();
	}
	
	private void agregarAlimento() 
	{
		alimento = new ArrayList<Alimento>();
		alimento.add(new Alimento(TipoAlimento.CALAMAR, 50));
		alimento.add(new Alimento(TipoAlimento.PULPO, 30));
		alimento.add(new Alimento(TipoAlimento.CANGREGO, 25));
	}
}
