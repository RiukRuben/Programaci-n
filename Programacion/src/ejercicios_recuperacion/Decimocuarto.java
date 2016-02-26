package ejercicios_recuperacion;

public class Decimocuarto {

	public static void main(String[] args) {
		int a=Integer.valueOf(args[0]);
		int b=Integer.valueOf(args[1]);
		int c=Integer.valueOf(args[2]);
		if (a>b && b>c)
			System.out.println("El mayor es: " + a);
			if (a>b && b<c)
				System.out.println("El mayor es: "+a);
			if (a<b && b>c)
			System.out.println("El mayor es: "+b);
			if (a<b && b<c)
				System.out.println("El mayor es: "+c);

	}

}
