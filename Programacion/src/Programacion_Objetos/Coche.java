package Programacion_Objetos;

public class Coche {

	String color;
	int velocidad;
	String tipo_rueda;
	String tipo_motor;

	void arranca() {
		System.out.println("El coche ha arrancado");
	}

	void frena() {
		System.out.println("El coche ha frenado");
	}

	void dobla(int giro, String lado) {
		System.out.println("El coche girara a la" + lado + "tantos" + giro + "grados");
	}
}
