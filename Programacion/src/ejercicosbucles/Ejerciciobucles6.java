package ejercicosbucles;

public class Ejerciciobucles6 {

	public static void main(String[] args) {
		int a = Integer.valueOf(args[0]);
		for (int i = a; i >=1; i--){
			for (int espacios = 0; espacios < a-i ; espacios++ ){
				System.out.print(" ");
			}
			for (int j = 0; j<1+(i-1)*2; j++){
				System.out.print("*");
			}
			System.out.println("");
			}
		

	}

}
