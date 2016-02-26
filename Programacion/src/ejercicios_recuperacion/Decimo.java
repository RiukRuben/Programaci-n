package ejercicios_recuperacion;

public class Decimo {

	public static void main(String[] args) {
		int numero=Integer.valueOf(args[0]);
		System.out.println("Tu numero es: "+numero);		
		System.out.println("El numero tiene: "+(numero/10000)+" decenas de millar");
		numero=numero%10000;
		System.out.println("El numero tiene: "+ (numero/1000)+" unidades de millar");
		numero=numero%1000;
		System.out.println("El numero tiene: "+(numero/100)+" centenas");
		numero=numero%100;
		System.out.println("El numero tiene: "+(numero/10)+" decenas");
		numero=numero%10;
		System.out.println("El numero tiene: "+(numero/1)+" unidades");

	}

}
