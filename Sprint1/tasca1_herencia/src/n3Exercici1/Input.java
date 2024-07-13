package tasca1_herencia.n3Exercici1;


import java.util.Scanner;

public class Input {
    public static final int OPCIO_ERROR = -1;
    private static Scanner input = new Scanner(System.in);

    public static int readInt(String message){
        int opcioUsuari = 0;
        System.out.println(message);
        if(input.hasNextInt()){
            opcioUsuari = input.nextInt();
        }else{
            opcioUsuari = OPCIO_ERROR;
        }
        return opcioUsuari;

    }
            
  
}
