package entities;

public class Company extends TaxPlayer{

	private Integer quantityEmployee;
	
	
	//COSTRUCTORS METOD
	public Company() {
		
	}
	
	public Company(String name, Double anualIncome, Integer quantityEmployee) {
		super(name, anualIncome);
		setQuantityEmployee(quantityEmployee);
	}
	
	//OTHERS METODS
	
	public void setQuantityEmployee(Integer quantityEmployee) {
		this.quantityEmployee = quantityEmployee;
	}
	
	public Integer getQuantityEmployee() {
		return this.quantityEmployee;
	}
	
	@Override
	public Double calculate() {
		Double tax = 0.0;
		
		if(getQuantityEmployee() <= 10) {
			tax = getAnualIncome() * 0.16;
		}
		else if (getQuantityEmployee() > 10) {
			tax = getAnualIncome() * 0.14;
		}
		
		return tax;
	}
	
}
