package ejercicios_recuperacion;

public class Noveno {

	public static void main(String[] args) {
		int velocidad=Integer.valueOf(args[0]);
		double calculo= velocidad*0.27;
		System.out.println("Su velocidad en km/h es: "+ velocidad);
		System.out.println("Su velocidad en m/s es: "+calculo);
	}

}
