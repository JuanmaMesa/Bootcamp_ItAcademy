package tasca1_Patterns1.nivell_2_AbstractFactory;

public class GestorFactoria extends AbstractFactory {

	@Override
	Gestor getGestor(String city) {
		
		if(city.equalsIgnoreCase("UK")) {
			return new UK();
			
		}else if(city.endsWith("Italian")) {
			return new Italian();
			
		}
		return null;
	}

}
