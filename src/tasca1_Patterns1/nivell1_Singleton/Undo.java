package tasca1_Patterns1.nivell1_Singleton;

import java.util.ArrayList;

public final class Undo {
	
	private static Undo instance;
	private  ArrayList<String>history;
	
	
	
	private Undo() {
		history = new ArrayList<>();
		
	}
	
	public static Undo getInstance() {
		
		if (instance == null) {
			instance = new Undo();
		}
		return instance;
		
	}
	
	public ArrayList<String> getHistory() {
		return history;
	
	}
	
	public  void addCommand(String command) {
		history.add(command);
	}
	
	public  void undo() {
		if(!history.isEmpty()) {
			history.remove(history.size()-1);
		}
	
	}
	

}
