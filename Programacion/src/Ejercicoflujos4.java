
public class Ejercicoflujos4 {
	public static void main(String[]args){
		int limite= Integer.valueOf(args[0]);
		int resultado = 0;
		for(int i=0;i<=limite;i++)
		{
			resultado = resultado + i;  // resultado += i;
			//Esto hace que se guarde un punto y se vuelva a sumar sobre el mismo, siempre entre llaves
		}
		
		System.out.println("Resultado del sumatorio 1 a 7 "+resultado);
	
	
		
		
	}

}
