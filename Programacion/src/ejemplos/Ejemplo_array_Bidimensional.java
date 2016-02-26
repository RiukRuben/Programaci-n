package ejemplos;

public class Ejemplo_array_Bidimensional {

	public static void main(String[] args) {
		int coordenadas[][] = new int[2][4];
		int otrascoordenadas[][] = { { 4, 5 }, { -7, 10 }, { 25, 3 }, { 8, 13 } };
		for (int j = 0; j < otrascoordenadas.length; j++) {
			int[] numeros = otrascoordenadas[j];
			for (int i = 0; i < numeros.length; i++){

				System.out.print(numeros[i] + " ");
			
		}
			System.out.println("\n");
		}
	}
}
