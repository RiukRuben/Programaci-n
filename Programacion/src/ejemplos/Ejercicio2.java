package ejemplos;

public class Ejercicio2 {

	public static void main(String[] args) {
		int n= Integer.valueOf(args[0]);
		for (int candidato=3;candidato<=n;candidato++)
		{
			boolean esPrimo=true;
			int divisior=3;
			while (esPrimo)
			{
				if (candidato%divisior==0)
					esPrimo = false;
				else 
					divisior++;
				if (divisior==candidato)
				{
					System.out.println(candidato);
					break;
					}
			}
		}
		


	}

}
