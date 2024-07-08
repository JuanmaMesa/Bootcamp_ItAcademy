package tasca7_annotations.n2exercici1;

import java.lang.reflect.Method;



@MyAnotations.SerializacioJson(directory = "data/output")
public class SrialitzarJSON {

	
	@MyAnotations.NivelSeguridad(MyAnotations.NivelSeguridad.Nivel.BAJO)
	public void myPassword(){
		
	}
	

	
}
