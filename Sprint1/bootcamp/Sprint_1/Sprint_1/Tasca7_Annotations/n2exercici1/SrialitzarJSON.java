package n2exercici1;

import java.lang.reflect.Method;

import n2exercici1.MyAnotations.NivelSeguridad;
import n2exercici1.MyAnotations.NivelSeguridad.Nivel;
import n2exercici1.MyAnotations.SerializacioJson;

@SerializacioJson(directory = "data/output")
public class SrialitzarJSON {

	
	@NivelSeguridad(Nivel.BAJO)
	public void myPassword(){
		
	}
	

	
}
