package ejemplos;

public class Ejemplo_Array_Suma_Bidemiensional {
	public static void main(String[] args) {
		int suma = 0;
		int coordenadas[][] = { { 4, 5 }, { -7, 10 }, { 25, 3 }, { 8, 3 } };
		int resultado[] = new int[coordenadas.length];
		for (int j = 0; j < coordenadas.length; j++) 
		{
			int numeros[] = coordenadas[j];

			for (int i = 0; i < numeros.length; i++)
				suma = suma + numeros[i];
			resultado[j] = suma;
			suma = 0;
		}
		for (int k = 0; k < resultado.length; k++) 
		{
			System.out.println(resultado[k]);
		}

	}

}
