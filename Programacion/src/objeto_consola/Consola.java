package objeto_consola;

public class Consola {
	boolean portatil;
	String salidavideo;
	boolean tresD;
	double dimensiones[]= new double[3];
	int capacidadCD;
	int nProcesadores;
	String marca;
	String modelo;
	Mando mandos[];
	int nMandos;
	
	public Consola()
	{
		marca="Sony";
	}
	public Consola(int nMandos)
	{
		this.nMandos=nMandos;
		mandos = new Mando[nMandos];
		for (int i = 0; i < mandos.length; i++) {
			mandos[i]=new Mando(16,true,"x60",100);
		}
	}
	
	public boolean isportatil()
	{
		return portatil;
	}

	/**
	 * @return the portatil
	 */
	public boolean isPortatil() 
	{
		return portatil;
	}

	/**
	 * @param portatil the portatil to set
	 */
	public void setPortatil(boolean portatil) 
	{
		this.portatil = portatil;
	}

	/**
	 * @return the salidavideo
	 */
	public String getSalidavideo()
	{
		return salidavideo;
	}

	/**
	 * @param salidavideo the salidavideo to set
	 */
	public void setSalidavideo(String salidavideo) 
	{
		this.salidavideo = salidavideo;
	}

	/**
	 * @return the tresD
	 */
	public boolean isTresD() 
	{
		return tresD;
	}

	/**
	 * @param tresD the tresD to set
	 */
	public void setTresD(boolean tresD) 
	{
		this.tresD = tresD;
	}

	/**
	 * @return the dimensiones
	 */
	public double[] getDimensiones()
	{
		return dimensiones;
	}

	/**
	 * @param dimensiones the dimensiones to set
	 */
	public void setDimensiones(double[] dimensiones) 
	{
		this.dimensiones = dimensiones;
	}

	/**
	 * @return the capacidadCD
	 */
	public int getCapacidadCD() 
	{
		return capacidadCD;
	}

	/**
	 * @param capacidadCD the capacidadCD to set
	 */
	public void setCapacidadCD(int capacidadCD) 
	{
		this.capacidadCD = capacidadCD;
	}

	/**
	 * @return the nProcesadores
	 */
	public int getnProcesadores() 
	{
		return nProcesadores;
	}

	/**
	 * @param nProcesadores the nProcesadores to set
	 */
	public void setnProcesadores(int nProcesadores) 
	{
		this.nProcesadores = nProcesadores;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() 
	{
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) 
	{
		this.marca = marca;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() 
	{
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) 
	{
		this.modelo = modelo;
	}

	/**
	 * @return the mandos
	 */
	public Mando[] getMandos() 
	{
		return mandos;
	}

	/**
	 * @param mandos the mandos to set
	 */
	public void setMandos(Mando[] mandos) 
	{
		this.mandos = mandos;
	}
}
