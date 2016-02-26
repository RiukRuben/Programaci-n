package ejercicios_recuperacion;

public class Quinto {

	public static void main(String[] args) {
		int c=20;
		System.out.println("El valor de c es par o no: "+(c%2==0?c+" es par":c+" es impar"));
		System.out.println("El valor de c es negativo o positivo: " + (c>=0?c+" Es positivo":c+" Es negativo"));
		System.out.println("c es multiplo de 5: "+(c%5==0?c+" Es multiplo de 5": c+" No es multiplo de 5"));
		System.out.println("c es multiplo de 10: "+(c%10==0?c+" Es multiplo de 10": c+" No es multiplo de 10"));
		System.out.println("c es menor o no que 100: "+(c>100?c+" Es mayor que 100": c+" No es mayor que 100"));

	}

}
