package principal_de_consola;

import objeto_consola.Consola;
import objeto_consola.Mando;

public class MainConsola {
	public static void main(String[] args){
		Consola consolaJM = new Consola(2);
		
		System.out.println(consolaJM.getModelo());
		System.out.println(consolaJM.getnProcesadores());
		
		Mando mando1deJM = consolaJM.getMandos()[0];
		
		System.out.println(mando1deJM.getBateria());
		
	}

}
