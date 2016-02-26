
public class Ejercicio6 {
	public static void main (String[]args){
		double a = Double.valueOf(args[0]);
		double b = Double.valueOf(args[1]);
		double c = Double.valueOf(args[2]);
		double d = (a+b+c)/3;
		if (a<=5)
			System.out.println("Suspenso");
		else if (b<=5){
			System.out.println("Suspenso");}
		else if (c<=5){
			System.out.println("Suspenso");}
		else if(d<=5){
			System.out.println("Suspenso");}
		else if (d<=6){
			System.out.println("Aprobado");}
		else if(d<=7){
			System.out.println("Bien");}
		else if(d<=9){
			System.out.println("Sobresaliente");}
		else if(d<=9.8){
			System.out.println("Matricula");}
	}

}
