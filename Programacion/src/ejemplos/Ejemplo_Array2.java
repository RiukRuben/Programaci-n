package ejemplos;

public class Ejemplo_Array2 {

	public static void main(String[] args) {
		int resultado=0;
		
		for(int i=0;i<args.length;i++){
//			int	a=Integer.valueOf(args[i]);
//			resultado=resultado+a;
			
			resultado += Integer.valueOf(args[i]);// esto es el resumen del lo representado en lo anterior.
		}

		System.out.println(resultado);
	

	
	}

}
