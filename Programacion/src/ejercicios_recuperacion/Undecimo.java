package ejercicios_recuperacion;

public class Undecimo {

	public static void main(String[] args) {
		int numero=Integer.valueOf(args[0]);
		
		if (numero%2==0){
			System.out.println("El numero es par: "+numero);
		}
		else{
			System.out.println("El numero es impar: "+numero);
		}
		
		if (numero%10==0){
			System.out.println("Es multiplo de 10: "+numero);
		}
		else{
			System.out.println("El numero no es multiplo de 10: "+numero);
		}

	}

}
