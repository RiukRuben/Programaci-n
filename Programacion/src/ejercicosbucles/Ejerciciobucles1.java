package ejercicosbucles;

public class Ejerciciobucles1 {
	public static void main(String[] args) {
		int limite = Integer.valueOf(args[0]);
		for (int inicio = 0; inicio < limite; inicio++)// con este bucle
														// marcamos las lienas
		{
			for (int j = 0; j <= inicio; j++)// con este bucle marcamos las
												// columnas
			{
				System.out.print("*");
			}
			System.out.println();// esto marca los saltos de liena
		}
	}
}
