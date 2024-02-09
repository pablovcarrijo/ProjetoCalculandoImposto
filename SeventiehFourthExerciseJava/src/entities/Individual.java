package entities;

public class Individual extends TaxPlayer{
	
	private Double helthExpenditures;
	
	public Individual() {
		
	}
	
	public Individual(String name, Double anualIncome, Double helthExpenditures) {
		super(name, anualIncome);
		setHelthExpenditures(helthExpenditures);
	}

	public void setHelthExpenditures(Double helthExpenditures) {
		this.helthExpenditures = helthExpenditures;
	}
	
	public Double getHelthExpenditures() {
		return this.helthExpenditures;
	}
	
	@Override
	public Double calculate() {
		Double tax = 0.0;
		if(getAnualIncome() < 20000) {
			tax = getAnualIncome() * 0.15;
			if(getHelthExpenditures() != 0) {
				tax -= getHelthExpenditures() * 0.5; 
			}
		}
		else if (getAnualIncome() >= 20000) {
			tax = getAnualIncome() * 0.25;
			if(getHelthExpenditures() != 0) {
				tax -= getHelthExpenditures() * 0.5;
			}
		}
		return tax;
	}
	
}
