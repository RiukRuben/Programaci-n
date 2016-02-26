package estatico;

public class Principal {

	public static void main(String[] args) {
		CuentaBanco cuentas [] = new CuentaBanco[3];
		cuentas [0] = new CuentaBanco(5784);
		cuentas [1] = new CuentaBanco(20);
		cuentas [2]= new CuentaBanco(-1043);

		System.out.println("El banco cuenta con un total de: "+ CuentaBanco.getSaldoTotal()+"euros repartidos en:");
		for (int i=0;i<cuentas.length;i++){
			System.out.println(cuentas[i].toString());
		}
	}
}
