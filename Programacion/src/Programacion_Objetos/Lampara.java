package Programacion_Objetos;

public class Lampara {
	String color;
	int tama�o;
	String tipo_bombilla;
	boolean tulipa;
	String forma;
	boolean encendida = false;
	Bombilla bombilla;


	boolean isEncendida() {
		return encendida;
	}

	void encender() {
		System.out.println("La lamapara se ha encendido");
	}

	void apagar() {
		System.out.println("La lamapara se ha apagado");
	}

}
