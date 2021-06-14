package entities;

public class Conversao {
	private double metros;
	private double polegadas;
	private double pes;
	
	public Conversao() {
		this.metros = metros;
		this.polegadas = polegadas;
		this.pes = pes;
	}

	
	
	public double getMetros() {
		return metros;
	}
	public void setMetros(double metros) {
		this.metros = metros;
	}
	public double getPolegadas() {
		return polegadas;
	}
	public void setPolegadas(double polegadas) {
		this.polegadas = polegadas;
	}
	public double getPes() {
		return pes;
	}
	public void setPes(double pes) {
		this.pes = pes;
	}
	

	 public double metrosParaPolegadas (double metros) {
		 double metrosP = metros * 39.37;
		 return metrosP;
	 }
	 
	 public double metrosParaPes (double metros) {
		 double metrosPes = metros * 3.28;
		 return metrosPes;
	 }
	
	 public double polegadasParaMetros (double polegadas) {
		 double polegadasM = polegadas / 39.37;
		 return polegadasM;
	 }
	 public double polegadasParapes (double polegadas) {
		 double polegadasPes = polegadas / 12;
		 return polegadasPes;
	 }
	 
	 public double pesParaMetros (double pes) {
		 double pesMetro = pes / 3.281;
		 return pesMetro;
	 }
	 
	 public double pesParaPolegadas (double pes) {
		 double pesPolegadas = pes * 12;
		 return pesPolegadas;
	 }
	 
	 
}
