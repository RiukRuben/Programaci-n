package objeto_consola;

public class Mando {
	int nTeclas;
	boolean inalambrico;
	String modelo;
	double bateria;
	
	
	/**
	 * @param nTeclas
	 * @param inalambrico
	 * @param modelo
	 * @param bateria
	 */
	public Mando(int nTeclas, boolean inalambrico, String modelo, double bateria) {
		super();
		this.nTeclas = nTeclas;
		this.inalambrico = inalambrico;
		this.modelo = modelo;
		this.bateria = bateria;
	}
	/**
	 * @return the nTeclas
	 */
	public int getnTeclas() {
		return nTeclas;
	}
	/**
	 * @param nTeclas the nTeclas to set
	 */
	public void setnTeclas(int nTeclas) {
		this.nTeclas = nTeclas;
	}
	/**
	 * @return the inalambrico
	 */
	public boolean isInalambrico() {
		return inalambrico;
	}
	/**
	 * @param inalambrico the inalambrico to set
	 */
	public void setInalambrico(boolean inalambrico) {
		this.inalambrico = inalambrico;
	}
	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/**
	 * @return the bateria
	 */
	public double getBateria() {
		return bateria;
	}
	/**
	 * @param bateria the bateria to set
	 */
	public void setBateria(double bateria) {
		this.bateria = bateria;
	}
}
