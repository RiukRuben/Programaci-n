package Programacion_Objetos;

public class Principal {

	public static void main(String[] args) {
		Lampara lamparaCocina = new Lampara();
		lamparaCocina.forma = "cuadrada";

		Bombilla b = new Bombilla();
		lamparaCocina.bombilla = b;
		lamparaCocina.bombilla.color = "azul";

		Lampara lamparaComedor;
		lamparaComedor = lamparaCocina;
		lamparaComedor.forma = "rombo";
		System.out.println(lamparaCocina.forma);

		// while (true)
		//		{
		// if (lamparaCocina.isEncendida())
		// System.out.println("Esta encendida");
		// else
		// System.out.println("Esta apagada");
		// }

	}

}