package ejemplos;

public class Ejemplo_Array3 {

	public static void main(String[] args) {
		int numeros[] = new int[10];
		int resultado = 0;
		int otrosNumeros[] = { 2, 60, 34, 6, 39, 14, 30, 53 };
		for (int i = 0; i < otrosNumeros.length; i++) {
			resultado = resultado + otrosNumeros[i];
		}
		System.out.println(resultado);

	}

}
