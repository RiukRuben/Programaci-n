package fechas;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, anno;
	
	System.out.println("Introduce fecha: ");
    System.out.print("dia: ");
    dia = sc.nextInt();
    System.out.print("mes: ");
    mes= sc.nextInt();
    System.out.print("año: ");
    anno = sc.nextInt();

	  Fecha fecha = new Fecha(dia,mes,anno);
      if (fecha.fechaCorrecta()) { 
    	  System.out.println("Fecha introducida: " + fecha);
    	  System.out.println("Los 10 días siguientes son:");
          for (int i = 1; i <= 10; i++) {
              fecha.diaSiguiente();
              System.out.println(fecha);
          }
      } else 
      {
          System.out.println("Fecha no valida");
      }

  }

}

