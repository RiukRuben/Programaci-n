package ejercicios_recuperacion;

public class Segundo {

	public static void main(String[] args) {
	int n=12;
	System.out.println("El valor de n es: "+n);
	System.out.println("El valor de n si le sumamos 77 es: "+(n+=77));//El igual hace que se guarde en la variable n y la actualice 
	System.out.println("El valor de n si le restamos 3 es: "+(n-=3));
	System.out.println("El valor de n si lo multiplicamos por 2 es: "+(n*2));

	}

}
