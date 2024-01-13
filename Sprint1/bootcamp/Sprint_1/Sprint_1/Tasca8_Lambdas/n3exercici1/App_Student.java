package n3exercici1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class App_Student {

	public static void main(String[] args) {
	
		ArrayList<Student>students = new ArrayList<>();
		
		students.add(new Student("Mark",17,"PHP",8));
		students.add(new Student("Almudena",28,"PHP",4.2f));
		students.add(new Student("Ricard",21,"React",5.8f));
		students.add(new Student("Juanma",39,"Java",7));
		students.add(new Student("Elena",32,"Java",9.3f));
		students.add(new Student("Soraya",40, "PHP", 6));
		students.add(new Student("Patricia",30,"Java",7));
		students.add(new Student("Jordi",39,"Java",8.5f));
		students.add(new Student("Oscar",37,"Java",9));
		students.add(new Student("Roger",17,"Java",5));
	
		
		
		System.out.println("_Lista de todos los alumnos_");
		students.stream()
			.sorted(Comparator.comparing(Student::getName))
			.forEach( s -> System.out.println("Nombre: "+ s.getName()+", Edad: " +s.getAge()));
		
		
		
		List<Student> studentsStarWithA = students.stream()
			.filter( s -> s.getName().startsWith("A"))
			.collect(Collectors.toList());
		
		System.out.println("\nEstudiantes del curso con las iniciaciales 'A'");
		studentsStarWithA.forEach( s -> System.out.println("Nombre: "+s.getName()+" Edad: "+s.getAge()));
		
	
		System.out.println("\n_Estudiantes aprobados_");
		students.stream()
			.filter( s -> s.getGrade() >= 5)
			.forEach( s -> System.out.println(s.toString()));
		
		System.out.println("\n_Estudiantes aprobados menos de la clase de PHP_");
		
		students.stream()
			.filter( (s)  ->  s.getGrade() >= 5 && s.getCourse()!= "PHP")
			.forEach(n  -> System.out.println(n.toString()));
		
		System.out.println("\n_Estudiantes mayores de edad de Java_");
		
		students.stream()
			.filter( (s) -> s.getCourse().equalsIgnoreCase("java") && s.getAge() >18 )
			.forEach( s -> System.out.println(s));
			
				
			
	


				

	}
	
	

}
