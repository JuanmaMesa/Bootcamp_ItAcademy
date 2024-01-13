package n1exercici1;

public class App_Employee {

	public static void main(String[] args) {
		
		float totalHoursOctober = 120;
		Online_Employee workerOnline1 = new Online_Employee("Mark", "Spriler", 29.6f);
		
		OnSite_Employee workerOnSite1 = new OnSite_Employee("John","Bull", 29.6f);
		
		System.out.println(workerOnline1.calculateSalary(totalHoursOctober));
		System.out.println(workerOnSite1.calculateSalary(totalHoursOctober));
		
		workerOnline1.infoSalary(totalHoursOctober);
		System.out.println("--------");
		workerOnSite1.infoSalary(totalHoursOctober);
		

	}


}
