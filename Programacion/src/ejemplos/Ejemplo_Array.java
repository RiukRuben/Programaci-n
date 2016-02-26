
package ejemplos;

public class Ejemplo_Array {

	public static void main(String[] args) {
		int numeros[] = new int [10];
		int otrosnumeros[] = {1,2,34,23};
		//Sin inicializar
		char mander[] = new char[10];
		//Un array inicializado, son caracteres
		//A= 65 en la tabla de caracteres, los demás números no me los sacaría porque no tiene valor en caracter
		char milion[] = {67,72,65,'R','M','I','L','I','O','N'};
		//Declaramos otra variable para que nos de la longitud de la variable números
		int l = numeros.length;
		System.out.println("Longitud numeros: "+l);
		//Utilizamos la misma variable para saber la longitud de la variable otrosnumeros
		l = otrosnumeros.length;
		System.out.println("Longitud otrosnumeros: "+l);
		//Vamos a sacar el ultimo caracter de la variable minion
		System.out.println("El caracter ultimo de milion es: "+milion[0]);
		

		//Como sacar todos los valores del array utilizando el .length (longitud del array)
		for (int i =0;i<milion.length;i++)
			System.out.print(milion[i]);
		
	}

}