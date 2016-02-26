package ejercicios_recuperacion;

public class Decimotercero {

	public static void main(String[] args) {
		int cociente=Integer.valueOf(args[0]);
		int divisor=Integer.valueOf(args[1]);

		if (divisor<1){
			System.out.println("Por favor introduzca otro numero mayor que 0");
		}
		else{
			int cuenta=cociente/divisor;
			System.out.println("Su resultado es: "+cuenta);
		}
	}

}
