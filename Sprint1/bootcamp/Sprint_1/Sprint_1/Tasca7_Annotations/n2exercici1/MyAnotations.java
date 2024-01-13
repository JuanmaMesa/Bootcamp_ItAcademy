package n2exercici1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class MyAnotations {

		@Target(ElementType.TYPE)// Puedo utilizar en clases / interfaces
		@Retention(RetentionPolicy.RUNTIME)// disponible en tiempo de ejecucion
		public @interface SerializacioJson{
			
			String directory();
		}
		
		@Target(ElementType.METHOD)
		@Retention(RetentionPolicy.RUNTIME)
		public @interface NivelSeguridad{
			
			Nivel value();
			
			enum Nivel{
				BAJO, MEDIO, ALTO
			}
			
		}

	
	
	
}
