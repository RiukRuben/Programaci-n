package ejercicios_recuperacion;

public class Octavo {

	public static void main(String[] args) {
		int radio=Integer.valueOf(args[0]);
		double longitud= radio*2*Math.PI;//Con esto sacas el numero PI
		double area= Math.PI*(radio*radio);
		System.out.println("El valor de la longitud es: "+longitud);
		System.out.println("El valor del area es: "+area);

	}

}
