package ejercicios_recuperacion;

public class Tercero {

	public static void main(String[] args) {
		int a=20;
		int b=7;
		int c=10;
		int d=15;
		int aux=7;
		b=c;
		c=a;
		a=d;
		d=aux;
		System.out.println("Hacemos que b tome el valor de c: "+b);
		System.out.println("Hacemos que c tome el valor de a: "+c);
		System.out.println("Hacemos que a tome el valor de d: "+a);
		System.out.println("Hacemos que d tome el valor de b: "+d);

	}

}
