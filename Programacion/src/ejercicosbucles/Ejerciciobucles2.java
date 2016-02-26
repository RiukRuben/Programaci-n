package ejercicosbucles;

public class Ejerciciobucles2 {

	public static void main(String[] args) {
		int limite = Integer.valueOf(args[0]);
		for (int inicio = limite; inicio > 0; inicio--)// el inicio se continua
														// haciendo mientras su
														// condicion no se
														// cumpla en el momento
														// en el que se cumpla
														// su condicion para
			{
			for (int j = inicio; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

}
