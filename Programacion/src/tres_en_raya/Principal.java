package tres_en_raya;

import java.util.Scanner;

public class Principal {


	public static void main(String[] args) {
		int opcion;
		do{
		System.out.println("-------------------------------");
		System.out.println("|  Pulsa 1 para: P1 VS CPU     |");
		System.out.println("|   Pulsa 2 para: P1 VS P2     |");
		System.out.println("|    Pulsa 3 para: Salir       |");
		System.out.println("| Por favor introduzca numero: |");
		System.out.println("-------------------------------");
		Scanner sc = new Scanner(System.in);
		opcion= sc.nextInt();
		switch(opcion){
		case 1:
			System.out.println();
			break;
		case 2:
			System.out.println();
			break;
		case 3:
			System.out.println("Gracias por jugar <3");
			break;
		default: 
			System.out.println("Por favor introduzca un numero del 1 al 3");
		}
	}
		
		while(opcion!=3);
	}
		
	
}
		
		
	


