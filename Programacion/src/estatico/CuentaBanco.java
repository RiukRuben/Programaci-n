package estatico;

public class CuentaBanco {
	private static double saldoTotal=0;
	private static int nCuentas=0;
	private double saldo;
	private int idCuenta;
	
	
	public CuentaBanco(double saldoInicial){
		// inicializamos el saldo de la cunta y le sumamos el saldo
		this.saldo= saldoInicial;
		CuentaBanco.saldoTotal+=saldo;
		// establecemos el id de la cuenta segune el total de cuentas
		CuentaBanco.nCuentas++;
		this.idCuenta= CuentaBanco.nCuentas;
	}




	public static double getSaldoTotal() {
		return saldoTotal;
	}

	public void ingresar(double cantidad){
		saldo+= cantidad;
		CuentaBanco.saldoTotal+= cantidad;
	}
	public void retirar(double cantidad){
		saldo -= cantidad;
		CuentaBanco.saldoTotal-=cantidad;
	}




	
	public String toString() {
		return "CuentaBanco numero: " + idCuenta + " tiene: " + saldo ;
	}
	
	
}
