package n1exercici1;

public class OnSite_Employee extends Employee {
	
	private static float fuelBonus = 45.8f;
	
	public OnSite_Employee(String name, String Surname, float price_hour){
		super(name, Surname, price_hour);
		
	}
	
	public float getFuelBonus() {
		return fuelBonus;
	}
	
	public void setFuelBonus(float newValor) {
		fuelBonus = newValor;
	}
	
	@Override
	public double calculateSalary (float numberHours_month) {
		
		double baseSalary = (super.calculateSalary(numberHours_month));
		double totalSalary = Math.round((baseSalary +fuelBonus)*100.0)/100.0;
		
		return totalSalary;
		
	}
	
	@Override
	public void infoSalary(float numbersHours) {
		
		super.infoSalary(numbersHours);
		System.out.println("Bonus fuel: "+fuelBonus+"\nTotal: "+calculateSalary(numbersHours));
		
		
		
	
		
	}
	

}
