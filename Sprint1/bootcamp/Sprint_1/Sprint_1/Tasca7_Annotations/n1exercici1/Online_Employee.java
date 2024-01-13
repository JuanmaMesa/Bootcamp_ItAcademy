package n1exercici1;

import java.text.DecimalFormat;

public class Online_Employee extends Employee {
	private static final float BONUS_INTERNET = 41.55f;
	
	public Online_Employee(String name, String Surname,float price_hour) {
		
		super(name,Surname, price_hour);
		
	}
	
	@Override
	public double calculateSalary(float numberHours_month) {
		
		double baseSalary = super.calculateSalary(numberHours_month);
		double totalSalary = baseSalary +BONUS_INTERNET;
		
		totalSalary = Math.round(totalSalary*100.0)/100.0;
	
	   return totalSalary; 
	}
	

	
	@Override
	public void infoSalary(float numbersHours) {
		
		super.infoSalary(numbersHours);
		System.out.println("Bonus Internet: "+BONUS_INTERNET+ "\nTotal salary: "+calculateSalary(numbersHours));
		

	}
}
