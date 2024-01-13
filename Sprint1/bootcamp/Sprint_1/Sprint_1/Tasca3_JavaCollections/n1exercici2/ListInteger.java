package n1exercici2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListInteger {

	public static void main(String[] args) {
	
		List<Integer> myList = new ArrayList<>();
		List<Integer>MyListInverse = new ArrayList<>();
		
		// adding in myList 5 numbers
		for(int indice =1; indice<6; indice++) {
			myList.add(indice);
			
		}
		
		System.out.println("--- using Iterator ---");
		
		Iterator<Integer> myIterator = myList.iterator();
		
		while(myIterator.hasNext()) {
			
			Integer num = myIterator.next();
			System.out.println(num);
		}
		
		System.out.println(".....");

		ListIterator<Integer> myListIterator = myList.listIterator(myList.size());// now iterator is at the end
		
		while(myListIterator.hasPrevious()) {
			
			Integer num = myListIterator.previous();
			MyListInverse.add(num);
			
		}
		
		for(Integer num : MyListInverse) {
			System.out.println(num);
			
		}
		
		
	}

}
