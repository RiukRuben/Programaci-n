package ejerciciosAvanzados;

public class Componente {
	Ingrediente ingrediente;
	double cantidad;
	public Ingrediente getIngrediente() {
		return ingrediente;
	}
	public void setIngrediente(Ingrediente ingrediente) {
		this.ingrediente = ingrediente;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public Componente(Ingrediente ingrediente, double cantidad){
		this.ingrediente=ingrediente;
		this.cantidad=cantidad;
	}

}
