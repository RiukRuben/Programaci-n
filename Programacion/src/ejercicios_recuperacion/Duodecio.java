package ejercicios_recuperacion;


import java.io.IOException;
import java.util.Scanner;

public class Duodecio {

	public static void main(String[] args) throws IOException{
		System.out.println("Introduzca su letra por favor:");
		Scanner sc=new Scanner(System.in);
		char letra=(char) System.in.read();//Convierte el char en String para k lo reconozca el escaner
		sc.close();
	if (Character.isUpperCase(letra)){//Con esto reconoce si es mayuscula o no 
		System.out.println("Es mayuscula");
	}
	else{
		System.out.println("Es minuscula");
	}
	}

}
