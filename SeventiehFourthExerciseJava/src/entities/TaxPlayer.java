package entities;

public abstract class TaxPlayer {

	private String name;
	private Double anualIncome;
	
	public TaxPlayer() {
		
	}
	
	public TaxPlayer(String name, Double anualIncome) {
		setName(name);
		setAnualIncome(anualIncome);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	public Double getAnualIncome() {
		return this.anualIncome;
	}
	
	public abstract Double calculate();
	
}
