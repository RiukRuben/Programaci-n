package ejercicosbucles;

public class Ejerciciobucles4 {

	public static void main(String[] args) {
		int limite = Integer.valueOf(args[0]);
		for (int inicio = 1; inicio <= limite; inicio++) {
			for (int j = 1; j <= inicio; j++)
			{
				System.out.print(j);
			}
			System.out.println();

		}

	}
}
