package Array;

public class MiArray {
	int array[];

	public MiArray() {
		array = new int[10];
		for (int i = 0; i <= 10; i++) {
			array[i] = -1;
		}
	}

	public MiArray(int longitud) {
		array = new int[longitud];
		for (int i = 0; i < longitud; i++) {
			array[i] = -1;
		}
	}

	public MiArray(int longitud, int valor) {
		array = new int[longitud];// esto es como se inicializa
		for (int i = 0; i < longitud; i++) {
			array[i] = valor;// esto es el "valor" que se le da a cada lugar del
								// array
		}
	}

	public void inicializa(int valor) {
		for (int i = 0; i < array.length; i++){
			array[i] = valor;
		}

	}

	public void resetear() {
		for (int i = 0; i < array.length; i++){
			array[i] =-1;
	}

	}
	public int sumaValores(){
		int suma=0;
		for (int i =0; i<array.length;i++){
			suma=suma+array[i];
			
		}
		return suma;
		
	}
	public int pares(){
		int contador=0;
		for (int i= 0; i<array.length;i++){
			
			if (i%2==0){
				contador++;
			}	
		}
		return contador;
	}
	public int impares(){
		int contador=0;
		for (int i=0; i<array.length;i++){
			if (i%2!=0){
				contador++;
			}
		}
		return contador;
	}
	public boolean contains(int numero){
		boolean contiene= false;
		for (int i=0; i<array.length; i++){
			if (numero==array[i]){
				contiene=true;
				}	
		}
		return contiene;
	}
	public int count(int numero){//siempre que en el enunciado ponga recibe
								//debes meter entre parentesis lo que recibe
								//si es un numero "int" si es true o false "boolean"
		int contador=0;
		for(int i=0; i<array.length; i++){
			if (numero==array[i]){
				contador++;
			}	
		}
		return contador;
	}
	public String toString(){
		return "Los valores del Array son: "+ array;
	}
	public String show(){
		return "El array es: " + array;
	}
	public int sumaArray(int numeroarray[], boolean actualiza){
		actualiza = false;
		int ret=0;
		for (int i=0; i<array.length;){
			
			if (actualiza==true){
				ret= array[i] + numeroarray[i];//cuando sumas array en el momento en el que se recorren
				//comparten posiciones, con lo cual solo necesitamos poner uno
			}	
		}
		return ret;
	}
	public MiArray clone(){
		MiArray arrayclone;
		arrayclone=new MiArray(array.length);
		for (int i=0; i<array.length; i++)
			arrayclone.array[i]=this.array[i];
		return arrayclone;
		
	}
	public MiArray contact(int array[]){
		MiArray arraycontact=new MiArray(array.length+this.array.length);
		int b=0;
		for (int i=0; i<this.array.length;i++){
			arraycontact.array[i]=this.array[i];
		}
		for(int x=this.array.length; x<(array.length+this.array.length);x++){
			arraycontact.array[x]=array[b];
			b++;
		}
		return arraycontact;
	}
}