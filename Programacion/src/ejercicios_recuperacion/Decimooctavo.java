package ejercicios_recuperacion;

public class Decimooctavo {

	public static void main(String[] args) {
		int primero=Integer.valueOf(args[0]);
		int segundo =Integer.valueOf(args[1]);
		segundo=segundo*2;
		for(int i=primero;i<segundo;i++){
			if (i%2!=0){
				System.out.println("Los impares son: "+i);
			}
		}

	}
	
}
