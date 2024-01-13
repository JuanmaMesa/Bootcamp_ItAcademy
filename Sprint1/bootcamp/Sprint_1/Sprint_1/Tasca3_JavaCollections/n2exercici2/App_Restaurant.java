package n2exercici2;

import n2exercici1.Restaurant;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App_Restaurant   {
	

	public static void main(String[] args) {
		
		Set<Restaurant> setRestaurants = new HashSet<>();
		
		setRestaurants.add(new Restaurant("Casa Juan", 7));
		setRestaurants.add(new Restaurant("Casa Juan", 8));
		setRestaurants.add(new Restaurant("El Diabolo", 5));
		setRestaurants.add(new Restaurant("Pizzeria LaMamma",5));
		setRestaurants.add(new Restaurant("Pizzeria LaMamma",8));
		setRestaurants.add(new Restaurant("Bar Antartida",5));
		
		
		Set<Restaurant> treeSetRestaurants = new TreeSet<>(setRestaurants); 
		
		System.out.println("__Restaurantes por orden alfatico y puntuacion__");
		treeSetRestaurants.forEach( r -> System.out.println(r));
		
	
	
		
	}


		
		

		
		
	
	
	}
	

		
