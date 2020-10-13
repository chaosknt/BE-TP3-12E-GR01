package ar.edu.ort.tp3.ej02;

public class Lavarropas extends Electrodomestico{
	
	private int cargaMaxima;
	private boolean semiAutomatico;

	public Lavarropas(String marca, String modelo, int numSerie, Voltaje tipo, 
			Estado estado, double precio, int cargaMaxima, boolean semiAutomatico) 
	{
		super(marca, modelo, numSerie, tipo, estado, precio);
		
		this.cargaMaxima = cargaMaxima;
		this.semiAutomatico = semiAutomatico;
		
	}

	public int getCargaMaxima() {
		return cargaMaxima;
	}

	public void setCargaMaxima(int cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}

	public boolean isSemiAutomatico() {
		return semiAutomatico;
	}

	public void setSemiAutomatico(boolean semiAutomatico) {
		this.semiAutomatico = semiAutomatico;
	}
	
	

}
