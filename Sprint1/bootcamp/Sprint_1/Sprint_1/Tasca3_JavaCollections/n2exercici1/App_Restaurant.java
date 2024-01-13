package n2exercici1;

import java.util.HashSet;
import java.util.Set;

public class App_Restaurant {

	public static Set<Restaurant> setRestaurants = new HashSet<>();
	public static void main(String[] args) {
		

		createAndAdd("Diabolo", 8);
		createAndAdd("Diabolo", 9);
		createAndAdd("Diabolo", 8);
		createAndAdd("Pizzeria la Mamma", 7);
		createAndAdd("Bar Antartida", 5);

				
		System.out.println("--list of Resturants--");
		for(Restaurant r : setRestaurants) {
			
			System.out.println(r);
		}

	}
	public static void createAndAdd(String name, int rating) {
		
		if(setRestaurants.add(new Restaurant(name, rating))) {
			System.out.println("Creado y guardado correctamente");
		}else {
			System.out.println("Restaurante repetido, No es posible guardar");
		}
		
		
	}

}
