package ejerciciosAvanzados;

public class Plato {
	String nombre;
	double precio;
	int dificultad;
	Componente[]receta;
	String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getDificultad() {
		return dificultad;
	}
	public void setDificultad(int dificultad) {
		this.dificultad = dificultad;
	}
	public Componente[] getReceta() {
		return receta;
	}
	public void setReceta(Componente[] receta) {
		this.receta = receta;
	}
	public Plato(String nombre, double precio, int dificultad, Componente[]receta){
		this.nombre=nombre;
		this.precio=precio;
		this.dificultad=dificultad;
		this.receta=receta;
	}

}
